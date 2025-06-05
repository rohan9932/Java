package com.rohan.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
////        Engine car = new Car(); //also can do this
//        car.accelerate();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine(); //changed to PowerEngine
        car.stop();
    }
}
