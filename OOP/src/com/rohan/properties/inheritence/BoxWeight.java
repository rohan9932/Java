package com.rohan.properties.inheritence;

public class BoxWeight extends Box {
    double weight;

    static void greeting() {
        System.out.println("Greeting from box weight");
    }

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other); //its possible Box old = other //depends on the ref var not the obj
                        //so will be able to just access Box object's elements
        this.weight = other.weight;
    }

    BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); //calling the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;
    }

    BoxWeight(double side, double weight) {
        super(side); //calling the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;
    }
}
