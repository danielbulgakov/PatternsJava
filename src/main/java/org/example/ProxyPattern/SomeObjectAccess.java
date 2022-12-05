package org.example.ProxyPattern;

public class SomeObjectAccess implements ObjectAccess{
    @Override
    public void access() {
        System.out.println("Предоставляется доступ к файлу");
    }
}
