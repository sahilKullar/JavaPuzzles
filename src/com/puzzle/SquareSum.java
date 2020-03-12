package com.puzzle;

public class SquareSum {
    private double num1, num2, num3;

    public SquareSum(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double calculateSquareSum() {
        return (num1*num1) + (num2*num2) + (num3*num3);
    }

    public static void main(String[] args) {
        SquareSum obj = new SquareSum(2, 3, 4);
        System.out.println(obj.calculateSquareSum());
    }

}

