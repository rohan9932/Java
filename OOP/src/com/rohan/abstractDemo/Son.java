package com.rohan.abstractDemo;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }

    //All child class needs to ovverride all the abstract methods from superclass as they have no body
    @Override
    void career(String name) {
        System.out.printf("I am going to be an %s.\n", name);
    }

    @Override
    void partner(String name, int age) {
        System.out.printf("I want to make %s as my partner and her age is %d\n", name, age);
    }
}
