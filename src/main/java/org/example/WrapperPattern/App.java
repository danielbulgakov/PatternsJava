package org.example.WrapperPattern;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("CCC");
        stringSet.add("ab");
        SetStringWrapper setStringWrapper = new SetStringWrapper(stringSet, WorldContext.RealWorld);
        var arr = setStringWrapper.toArray();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(setStringWrapper.size());

    }

}
