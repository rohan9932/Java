package com.rohan.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();
        Circle circle = new Circle();
        circle.area();
        Square square = new Square();
        square.area();

        Shapes traingle = new Traingle();
        traingle.area();
    }
}
