package com.puzzle;

import java.util.Scanner;

interface Addition {
    int add(int num1, int num2);
}

class Calculate implements Addition {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class InterfacePractise {
    public static void main(String[] args) {
//        Calculate calculate = new Calculate();
//        System.out.println(calculate.add(10, 20));
        System.out.println((String) null);

    }
}