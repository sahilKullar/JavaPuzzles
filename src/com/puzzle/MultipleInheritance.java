package com.puzzle;

class Carr {

    private int model;
    private String manufacturer;

    public Carr(int model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void printDetails() {
        System.out.println("The model of " + getClass().getSimpleName() + " is: " + model);
        System.out.println("The manufacturer of " + getClass().getSimpleName() + " is: " + manufacturer);
    }

}

interface isSedan {
    int bootSpace = 420;
    void bootSpace();
}

class Elantra extends Carr implements isSedan {

    private String variant;

    public Elantra(int model, String variant) {
        super(model, "Hyundai"); // Calling the parent constructor with alredy known manufacturer
        this.variant = variant;
    }

    @Override
    public void bootSpace() { // Implementation of the interface method
        System.out.println("The boot space of Elantra is " + isSedan.bootSpace + " litres");
    }

    @Override
    public void printDetails() {  // Overriding the parent class's inherited method
        super.printDetails();    // Calling the method from parent class
        System.out.println("The variant of Elantra is: " + variant); // printing the data member of this class
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Elantra elantra = new Elantra(2019, "Sports");
        elantra.printDetails();
        elantra.bootSpace();
    }
}