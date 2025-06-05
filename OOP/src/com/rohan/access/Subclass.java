package com.rohan.access;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass sub = new Subclass(5, "Sub");
        System.out.println(sub.name);
    }
}
