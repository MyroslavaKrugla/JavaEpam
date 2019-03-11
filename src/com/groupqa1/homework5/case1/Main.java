package com.groupqa1.homework5.case1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printArray(5)));
        int [] arr = printArray(5);
        printRevertArray(printArray(4));
    }

    static int [] printArray (int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30) - 10;
        }
        return array;
    }

    static void printRevertArray (int [] arr) {
        int[] rev_arr = arr;
        for (int i = arr.length - 1; i >= 0; i++) {
            rev_arr[arr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(rev_arr));
    }
}
