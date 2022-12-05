package org.example.ProxyPattern;

public class App {
    public static void noRoles() {
        ObjectAccess someObjectAccess = new SomeObjectAccess();
        someObjectAccess.access();
    }

    public static void withRolesFail() {
        ObjectAccess someObjectAccess = new SomeObjectAccessProxy(Roles.User);
        someObjectAccess.access();
    }

    public static void withRolesGranted() {
        ObjectAccess someObjectAccess = new SomeObjectAccessProxy(Roles.Admin);
        someObjectAccess.access();
    }

    public static void main(String[] args) {
        System.out.println("-----");
        noRoles();
        System.out.println("-----");
        withRolesFail();
        System.out.println("-----");
        withRolesGranted();
        System.out.println("-----");
    }


}
