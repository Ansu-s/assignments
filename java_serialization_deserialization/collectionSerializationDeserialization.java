package com.java.mypackage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class collectionSerializationDeserialization {



        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("Ansu");
            names.add("Ram");
            names.add("Hari");

            try (FileOutputStream fileOut = new FileOutputStream("names.ser");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(names);
                System.out.println("List of names serialized successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileInputStream fileIn = new FileInputStream("names.ser");
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                List<String> deserializedNames = (List<String>) in.readObject();
                System.out.println("List of names deserialized successfully.");
                System.out.println("Deserialized Names: " + deserializedNames);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


}
