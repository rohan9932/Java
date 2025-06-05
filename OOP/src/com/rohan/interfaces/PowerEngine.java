package com.rohan.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void startEngine() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine accelerating");
    }
}
