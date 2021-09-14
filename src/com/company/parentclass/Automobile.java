package com.company.parentclass;

public class Automobile {
    private String brend;
    private String model;
    private int year;
    public static int i;

   /* public Automobile(String brend, String model, int year) {
        this.brend = brend;
        this.model = model;
        this.year = year;
    }*/

public String getAuto(){
    return brend + ' ' + model;
}
   @Override
    public String toString() {
        return "Automobile{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
