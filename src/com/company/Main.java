package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     StringBuilder sb = new StringBuilder("Test");
        System.out.println(sb.toString());
        sb.append(" test");
        System.out.println(sb.toString());
        sb.append(" tESt").append(" TesT");
        System.out.println(sb);

    }
}
