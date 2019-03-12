package com.groupqa1.homework5.case1;

public class Main {
    public static void main(String[] args) {
        int[] array = getArray(10);
        System.out.println();
        printRevertArray(array);
    }

    static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 30);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static void printRevertArray(int[] arr){
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
