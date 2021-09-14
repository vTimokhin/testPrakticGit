package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RoomOne rw = new RoomOne(1);
        House rw2 = new RoomOne(2);
        List<House> listHouse = new ArrayList<>();
        printXToRoom(listHouse);
    }

    private static void printXToRoom(List<House> lh) {
        for (House house : lh) {
            house.toString();
        }
    }
}
