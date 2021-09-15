package com.company.lambda;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.price();

        House house1 = new House() {
            @Override
            public void price() {
                System.out.println("price of Room");
            }
        };
        house1.price();
    }
}

class House {
    public void price () {
        System.out.println("price of house");
    }
}
/*class Room extends House {
    @Override
    public void price () {
        System.out.println("price of Room");
    }
        }*/
