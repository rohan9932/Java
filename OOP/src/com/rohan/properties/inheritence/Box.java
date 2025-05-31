package com.rohan.properties.inheritence;

public class Box {
    double length;
    double width;
    double height;

    static void greeting() { //static methods are not overriden
        System.out.println("Greeting from box");
    }

    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    //cube
    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    //3 args
    Box(double length, double width, double height) {
        System.out.println("Parent Class Constructor");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //cpy box
    Box(Box old) {
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    public void info() {
        System.out.println("Running the box");
    }
}
