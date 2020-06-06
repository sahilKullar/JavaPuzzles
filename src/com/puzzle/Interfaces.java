package com.puzzle;

class Bird {
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }
}

interface canFly {
    void flying();
}


class Parrot extends Bird implements canFly {

    @Override
    public void flying() {
        System.out.println("Parrot is flying");
    }
}

class Penguin extends Bird {
    public void walk() {
        System.out.println("Penguin is Walking");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        parrot.eat();
        parrot.flying();

        penguin.eat();
        penguin.walk();
    }
}

