package org.example.ProxyPattern;

public class SomeObjectAccessProxy implements ObjectAccess{
    private final SomeObjectAccess someObjectAccess = new SomeObjectAccess();
    private final Roles role;

    public SomeObjectAccessProxy(Roles role) {
        this.role = role;
    }

    @Override
    public void access() {
        if (role == Roles.Admin) {
            System.out.println("Доступ подтвержден");
            someObjectAccess.access();
        }
        else {
            System.out.println("Права доступа имеет только Admin");
        }
    }
}
