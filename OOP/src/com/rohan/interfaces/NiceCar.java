package com.rohan.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new ElectricEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }
    public void stop() {
        engine.stopEngine();
    }
    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        engine = new PowerEngine(); //updating the engine
    }
}
