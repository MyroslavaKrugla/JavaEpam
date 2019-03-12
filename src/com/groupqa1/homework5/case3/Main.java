package com.groupqa1.homework5.case3;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        int[] array1 = getArray(size);
        System.out.println();
        int[] array2 = getArray(size);
        System.out.println();
        getSumArray(size, array1, array2);
    }

    static void getSumArray(int size, int[] array1, int[] array2) {
        int[] array3 = new int[size];
        for (int i = 0; i < size; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + " ");
        }
    }

    static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 30);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
