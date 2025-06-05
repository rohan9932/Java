package com.rohan.interfaces;

public class Car implements Brake, Engine {
    @Override
    public void brake() {
        System.out.println("Braking");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }
}
