package com.puzzle;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n) {
        if (n < 1) {
           return -1; //error if less than 1
        } else if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
