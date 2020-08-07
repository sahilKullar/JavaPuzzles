package com.puzzle;

import java.util.Arrays;

public class RemoveEvenArray {

    public int[] removeArray(int[] arr) {
        int oddElements = 0;

        for (int val : arr)
            if (val % 2 != 0) oddElements++;

        int[] newArray = new int[oddElements];
        int j = 0;

        for (int value : arr) {
            if (value % 2 != 0) {
                newArray[j] = value;
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        RemoveEvenArray removeEvenArray = new RemoveEvenArray();
        System.out.println(Arrays.toString(removeEvenArray.removeArray(new int[]{1, 2, 4, 5, 10, 6, 3})));
    }
}
