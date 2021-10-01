package com.company.streamapitest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(new Notebook(1,"b1", "m1", 1000));
        notebookList.add(new Notebook(1,"b2", "m2", 2000));
        notebookList.add(new Notebook(1,"b3", "m3", 3000));
        notebookList.add(new Notebook(1,"b4", "m4", 2000));
        notebookList.add(new Notebook(1,"b1", "m3", 200));
        notebookList.add(new Notebook(1,"b1", "m5", 8000));
        notebookList.add(new Notebook(1,"b1", "m6", 7000));
        for (Notebook notebook: notebookList
             ) {
            System.out.println(notebook);
        }

    }
}
