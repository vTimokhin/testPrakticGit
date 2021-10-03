package com.company.compar;

import com.company.Person;
import com.company.Sex;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    Set persons = new TreeSet();
    persons.add(new Person("Tom", 22, Sex.FEMALE));
    persons.add(new Person("Tim", 12, Sex.MALE));
    persons.add(new Person("Cristy", 34, Sex.MALE));
    persons.add(new Person("Lisy", 53, Sex.FEMALE));
        for (Object p: persons
             ) {
            System.out.println(p);

        }
    }
}





