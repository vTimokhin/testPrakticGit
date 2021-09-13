package com.company.interfaces;
public class Main {
    public static void main(String[] args) {
        Automobile auto = new Hotrod(100);
        Automobile auto2 = new Jeep(60);
        System.out.println(auto.maxSpeed());
        System.out.println(auto2.maxSpeed());
    }
}
