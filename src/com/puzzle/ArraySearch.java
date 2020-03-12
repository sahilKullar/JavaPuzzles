package com.puzzle;

public class ArraySearch {

    public static int search(int[] array, int target) {
//        int index = 0;
//        for (int i : array) {
//            if (i == target) {
//                return index;
//            }
//            index++;
//        }
//        return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 3, 4, 5, 6, 7}, 5)); // 3
        System.out.println(search(new int[]{2, 3, 4, 5, 6, 7}, 9)); // -1
    }
}
