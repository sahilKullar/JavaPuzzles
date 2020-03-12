package com.puzzle;

//public class InheritanceKlass {
//}


// Base Class Vehicle
class Vehicle {

    // Private Fields
    private String make;
    private String color;
    private int year;
    private String model;


    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

}

// Derived Class Car
class CarKlass extends Vehicle {

    // Private field
    private String bodyStyle;

    // Parameterized Constructor
    public CarKlass(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
//        printDetails();         //calling method from parent class
//        System.out.println("Body Style: " + bodyStyle);
        super.printDetails();
    }

}

class Main {

    public static void main(String[] args) {
        CarKlass elantraSedan = new CarKlass("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
        elantraSedan.carDetails(); //calling method to print details
    }

}