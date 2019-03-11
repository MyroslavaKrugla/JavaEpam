package com.groupqa1.lesson5.case2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = createArrayIntegers(5);
        System.out.println(Arrays.toString(array));
        System.out.println("Max - Min = " + sub(array));
    }

    static int[] createArrayIntegers (int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30) - 10;
        }
        return array;
    }

    static Integer sub (int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : array){
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        return max - min;
    }
}
