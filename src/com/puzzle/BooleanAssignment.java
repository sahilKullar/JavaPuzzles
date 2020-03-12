package com.puzzle;

public class BooleanAssignment {

    public static boolean birdsSinging(int temp, boolean isSummer) {

//        if (isSummer) {
//            return temp >= 60 && temp <= 100;
//        } else {
//            return temp >= 60 && temp <= 90;
//        }

        return (isSummer) ? (temp >= 60 && temp <= 100) : (temp >= 60 && temp <= 90);

    }

    public static void main(String[] args) {
        System.out.println(birdsSinging(70, false));
        System.out.println(birdsSinging(95, false));
        System.out.println(birdsSinging(95, true));
    }
}
