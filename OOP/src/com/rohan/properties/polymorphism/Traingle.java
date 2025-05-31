package com.rohan.properties.polymorphism;

public class Traingle extends Shapes{
    @Override //annotation
    void area() {
        System.out.println("1/2 * a * b");
    }
}
