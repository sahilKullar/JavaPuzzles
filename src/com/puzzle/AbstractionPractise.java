package com.puzzle;

abstract class Book {

    protected String name;
    protected String author;
    protected String price;

    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public abstract void getDetails();
}

class MyBook extends Book {

    public MyBook(String name, String author, String price) {
        super(name, author, price);
    }

    @Override
    public void getDetails() {
        System.out.println(name + ", " + author + ", " + price);
    }
}

public class AbstractionPractise {
    public static void main(String[] args) {
        Book myBook = new MyBook("Harry Potter", "J.k. Rowling", "100");
        myBook.getDetails();
    }
}