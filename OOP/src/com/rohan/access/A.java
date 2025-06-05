package com.rohan.access;

public class A {
    private int num;
    protected String name;
    int[] arr;

    public int getNum() { //getter
        return num;
    }

    public void setNum(int num) { //setter
        this.num = num;
    }

    protected A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
