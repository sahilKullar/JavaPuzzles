package com.puzzle;

public class StringRecursion {
    public static String allDollars(String str) {
//        StringBuilder word = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            word.append(str.charAt(i)).append("$");
//        }
//        return word.substring(0, word.length() - 1);

        if (str.length() <= 1) return str;
        return str.charAt(0) + "$" + allDollars(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(allDollars("hello"));
    }
}
