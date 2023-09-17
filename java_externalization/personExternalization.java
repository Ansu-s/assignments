package com.java.mypackage;
import java.io.*;
public class personExternalization {
}

class People implements Externalizable {
    private String name;
    private int age;

    // Default constructor (required for Externalizable)
    public People() {}

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

