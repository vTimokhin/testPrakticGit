package com.company.lambda;

import java.util.Objects;

public class Mainequals {
    public static void main(String[] args) {
        HouseTwo houseTwo = new HouseTwo(1);
        HouseTwo houseOne = new HouseTwo(1);
        String st = new String("we");
        //System.out.println(houseOne);


    }
}

/**
 *  house two
 *
 */
class HouseTwo {
    private int id;

    public HouseTwo(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseTwo houseTwo = (HouseTwo) o;
        return id == houseTwo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
