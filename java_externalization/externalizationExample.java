package com.java.mypackage;

import java.io.*;

public class externalizationExample {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.ser"))) {
            Person person = new Person("Ansu", 23);
            oos.writeObject(person);
            System.out.println("Person object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.ser"))) {
            Person People = (Person) ois.readObject();
            System.out.println("Person object deserialized: " + People);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
