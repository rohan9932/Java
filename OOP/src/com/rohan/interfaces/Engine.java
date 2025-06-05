package com.rohan.interfaces;

public interface Engine {
    static final int price = 120000; //by default
    //we can write int price = 120000; also

    void startEngine();
    void stopEngine();
    void accelerate();
}
