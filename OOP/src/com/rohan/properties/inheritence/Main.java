package com.rohan.properties.inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(2.5, 3.5, 4.9);
//        Box box2 = new Box(box);
//        System.out.printf("%.2f %.2f %.2f\n", box.length, box.width, box.height);
//        System.out.printf("%.2f %.2f %.2f\n", box2.length, box2.width, box2.height);
//
        //BoxWeight boxw = new BoxWeight(5, 5, 5, 5);
//        System.out.printf("%.2f %.2f %.2f %.2f\n", boxw.length, boxw.width, boxw.height, boxw.weight);

        //when the reference to a subclass object is assigned to a superclass variable only which elements are in the
        //superclass can be accessed
        Box b1 = new BoxWeight();
//        System.out.printf("%.2f \n", b1.length);
       //System.out.printf("%.2f \n", b1.weight); //it is not possible

        //But a subclass ref variable can't refer to a superclass object
        //BoxWeight b2 = new Box(); //this is wrong


//        BoxPrice box = new BoxPrice();
        b1.greeting();
    }
}
