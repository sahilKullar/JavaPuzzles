package com.puzzle;

public class StringManipulation {

    public static String middleThreeString(String str) {
        if (str.length() >= 3) {
            int mid = str.length() / 2;
            str = str.substring(mid - 1, mid + 2);
        }
        return str;
    }


    public static void main(String[] args) {
//        StringManipulation obj = new StringManipulation();
        System.out.println(middleThreeString("monitor"));
        System.out.println(middleThreeString("bunny"));
    }

}
