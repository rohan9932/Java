package com.rohan.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10; //it's a primitive
        Integer b = 45; //it's an object
        Integer c = 50;
        System.out.printf("%d %d\n", b, c);

//        final A rohan = new A("Rohan");
//        rohan.name = "Rahim"; //can do this -> just changing values not reference variables
        //when a non primitive is final we can't reassign it;
//        rohan = new A("new Obj"); //can't do this -> as it's changing the reference variable pointing to

//        for (int i = 0; i < 1000000000; i++) { //for showing finalizer
//            A obj = new A("new Obj");
//        }

        A obj = new A("Rohan");
        System.out.println(obj);

    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 122;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called and object is destroyed");
    }
}