package com.puzzle;

// Rectangle Class
class Rectangle {

    // Write Fields Here
    private int length, width;

    public Rectangle() {

        // Write your code here
        this.length = 0;
        this.width = 0;

    }

    public Rectangle(int length, int width) {

        // Write your code here
        this();
        this.length = length;
        this.width = width;

    }

    public int getArea() {

        // Write your code here
        return length * width;
    }

}

public class EncapsulationRectangle {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2, 2);
        System.out.println(obj.getArea());
    }

}
