package com.puzzle;

// Car class
class Car {

    // Private Fields
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Car() {
        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Car(String name, String model) {
        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Car(String name, String model, String capacity) {
        this(name, model); // calling parameterized Constructor
        this.carCapacity = capacity; // Assigning capacity
    }

    // Method to return car details
    public String getDetails() {
        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

}

class ConstructorFromConstructor {
    public static void main(String[] args) {
        Car obj = new Car("Ferrari", "F8", "100");
        System.out.println(obj.getDetails());
    }
}
