package com.company.parentclass;

public class Jeep extends Automobile{
   private String country;

   public Jeep(String country) {
       this.country = country;
   }

   @Override
   public String getAuto(){
       return country;
   }

    @Override
    public String toString() {
        return "Jeep{" +
                "country='" + country + '\'' +
                '}';
    }
}
