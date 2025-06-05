package com.rohan.interfaces.defaultImplementationInterface;

public interface A {
    default void greet() {
        System.out.println("Greeting");
    }

    //static methods here always have a body
    static void hello() {
        System.out.println("Hello");
    }
}
