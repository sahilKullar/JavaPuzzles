package com.puzzle;

public class Polymorphism {
    public static void main(String[] args) {
        Shape circle = new XShape("Circle");
        System.out.println(circle.getName());
    }
}


class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class XShape extends Shape {
    private String name;

    public XShape(String name) {
        super("Shape");
        this.name = name;
    }

    public String getName() {
        return super.getName() + ", " + this.name;
    }
}

