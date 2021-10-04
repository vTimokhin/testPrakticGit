package com.company.streamapitest;

import java.util.ArrayList;
import java.util.List;

public class Sortings {
    public static void sotringOne(List<Notebook> noteList) {
        noteList.stream()
                .skip(2)
                .filter(n -> n.getBrand().equalsIgnoreCase("b1"))
                .distinct()
                .map((n) -> n.getModel() + "_1" )

                .forEach(System.out::println);

        //return noteList;
    }

    public static void sortingTwo (List<Notebook> noteList){
        noteList.stream()
                //.filter(n -> n.getPrice() > 3000 ? 010 : 020)
                .forEach(System.out::println);
    }
}
