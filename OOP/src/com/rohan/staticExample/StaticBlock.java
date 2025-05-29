package com.rohan.staticExample;

//initialization of static variables
public class StaticBlock {
    static int a = 4; //first these static are run
    static int b;

    //will only run once, when the first obj is created
    static { //then this static initialization block will run
        System.out.println("Static Block");
        b = a * 10;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.printf("a = %d, b = %d\n", StaticBlock.a, StaticBlock.b);

        StaticBlock.b += 5;

        StaticBlock obj2 = new StaticBlock();
        System.out.printf("a = %d, b = %d\n", StaticBlock.a, StaticBlock.b);
    }
}
