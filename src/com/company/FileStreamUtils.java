package com.company;

import java.io.*;

public class FileStreamUtils {
    public static void main(String[] args) {
        Avto avt1 = new Avto(2, "bmw");
        Avto avt2 = new Avto(3, "renault");

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.bin"));
            oos.writeObject(avt1);
            oos.writeObject(avt2);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Rider {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        Avto avt;
        Avto avt1;

        {
            try {
                fileInputStream = new FileInputStream("test.bin");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                avt = (Avto) objectInputStream.readObject();
                avt1 = (Avto) objectInputStream.readObject();

                System.out.println(avt);
                System.out.println(avt1);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }



        }
    }

}

class Avto implements Serializable {
    private int id;
    private String name;

    public Avto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name;
    }
}
