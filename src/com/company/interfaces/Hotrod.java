package com.company.interfaces;
public class Hotrod implements Automobile{
    private int speed;

    public Hotrod(int speed) {
        this.speed = speed;
   }

    @Override
    public String toString() {
        return "Hotrod{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public int maxSpeed() {
        return speed + 20;
    }

    @Override
    public int minSpeed() {
        return speed - 20;
    }
}
