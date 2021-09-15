package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouse = new ArrayList<>();
        listOfHouse.add(new House(1));
        listOfHouse.add(new House (2));

        List<RoomOne> listOfRoomOne = new ArrayList<>();
        listOfRoomOne.add(new RoomOne(3));
        listOfRoomOne.add(new RoomOne(4));

        printXToRoom(listOfHouse);
        //printXToRoom(listOfRoomOne);
    }

    private static void printXToRoom(List<? extends House> lh) {
        for (House house : lh) {
            System.out.println(house.toString());
        }
    }
}
