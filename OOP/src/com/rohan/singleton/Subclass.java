package com.rohan.singleton;

import com.rohan.access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        A obj = new A(5, "Rohan");
//        System.out.println(obj.name); //can't access as protected variables are only accessed by subclass when in diff package
    }

}
