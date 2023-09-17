package com.java.mypackage;
import java.io.*;

class Book implements Externalizable {
    private String title;
    private String author;
    private int year;

    public Book() {}

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(title);
        out.writeInt(year);
        out.writeObject(author);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        title = (String) in.readObject();
        year = in.readInt();
        author = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

public class externalizaionExp {
    public static void main(String[] args) {
        try (ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            Book book = new Book("Head first into Java", "Kathy Sierra & Bert Bates", 2003);
            oops.writeObject(book);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))) {
            Book book = (Book) ois.readObject();
            System.out.println("Book object deserialized: " + book);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

