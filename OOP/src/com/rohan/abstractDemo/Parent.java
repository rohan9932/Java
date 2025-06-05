package com.rohan.abstractDemo;

public abstract class Parent {
    //we can't create object of abstract classes
    int age;
    public Parent(int age) { //we can create constructor of abstract class but can't call it
        this.age = age;
    }

//    abstract Parent(); //we can't create it

    static void greeting() {
        System.out.println("Hello World");
    }

    void normal() {
        System.out.println("Normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
    //It looks more cleaner. If we want to make a func that is needed to overriden by child then making it abstract is a
    //good option
}
