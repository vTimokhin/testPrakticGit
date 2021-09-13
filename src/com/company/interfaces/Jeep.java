package com.company.interfaces;

public class Jeep implements Automobile {
    private int speed;

    public Jeep(int speed) {
        this.speed = speed;
    }

    @Override
    public int maxSpeed() {
        return speed -50;
    }

    @Override
    public int minSpeed() {
        return 0;
    }
}
