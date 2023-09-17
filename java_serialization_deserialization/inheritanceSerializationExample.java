package com.java.mypackage;
import java.io.*;

class Person implements Serializable {
    private String name;

    public Person(String name, int i) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SerializablePerson extends Person {

    public SerializablePerson() {
        super("Default name is Aryan", 30);
    }

    public SerializablePerson(String name) {
        super(name, 30);
    }
}

public class inheritanceSerializationExample {
    public static void main(String[] args) {
        SerializablePerson person = new SerializablePerson("Ansu");

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Person serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            SerializablePerson deserializedPerson = (SerializablePerson) in.readObject();
            System.out.println("Person deserialized successfully.");
            System.out.println("Deserialized Person: " + deserializedPerson.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
