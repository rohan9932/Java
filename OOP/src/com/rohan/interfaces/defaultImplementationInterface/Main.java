package com.rohan.interfaces.defaultImplementationInterface;

public class Main implements B , A{
    @Override
    public void fun() {

    }
    //we are not getting error for not overriding greet() from A

    public static void main(String[] args) {
        Main obj = new Main();
        A.hello();
    }
}
