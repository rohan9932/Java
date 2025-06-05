package com.rohan.interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Electric Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerating");
    }
}
