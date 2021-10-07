package com.company.alltests;

public class Threads {
    public static void main(String[] args) {
        MyThreads myThread1 = new MyThreads();
        myThread1.run();
        System.out.println("Main");

    }
}

class MyThreads extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Potok_1 " + i);

        }
    }
}
