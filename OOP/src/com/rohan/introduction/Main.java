package com.rohan.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(122, "Rohan", 90.5f);
//        s1.rollNo = 122;
//        s1.name = "Rohan";
//        s1.marks = 90.5f;

        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student one = new Student();
        Student two = one;

        one.name = "Rohan";
        System.out.println(two.name);
    }
}

//create a class
class Student {
    int rollNo;
    String name;
    float marks;

    //constructor
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student() {
        this.rollNo = 23;
        this.name = "Rohan";
        this.marks = 5.5f;
    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
