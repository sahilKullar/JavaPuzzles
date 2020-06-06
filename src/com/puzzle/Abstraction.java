package com.puzzle;

abstract class Animal {

    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving");
    }

    public abstract void makeSound();

}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Sheep extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bhaa");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal sheep = new Sheep();

        dog.move();     // Calling methods from Dog
        dog.makeSound();

        cat.move();     // Calling methods from Cat
        cat.makeSound();

        sheep.move();   // Calling methods from Sheep
        sheep.makeSound();

    }
}
