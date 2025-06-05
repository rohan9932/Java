package com.rohan.access;

public class Main {
    public static void main(String[] args) {
        A a = new A(50, "Rohan");

        String A = a.name;
        ObjectDemo objdem = new ObjectDemo(45);
        System.out.println(objdem instanceof Object); //checks if objdem instance of Object

        System.out.println(a.getClass()); //getter of an object
    }
}
