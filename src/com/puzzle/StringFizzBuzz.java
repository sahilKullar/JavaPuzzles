package com.puzzle;

public class StringFizzBuzz {

    public static String fizzyWizzy(int num) {
        if (num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz!";
        else if (num % 3 == 0)
            return "Fizz!";
        else if (num % 5 == 0)
            return "Buzz!";
        else
//            return String.valueOf(num) + "!";
            return num + "!";
    }

    public static void main(String[] args) {
        System.out.println(fizzyWizzy(1));
        System.out.println(fizzyWizzy(2));
        System.out.println(fizzyWizzy(3));
        System.out.println(fizzyWizzy(5));
        System.out.println(fizzyWizzy(15));
    }
}
