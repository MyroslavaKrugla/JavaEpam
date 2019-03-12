package com.groupqa1.homework5.case2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 30 - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        printSumAndQuantity(array);
    }

    private static void printSumAndQuantity(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                sum += array[i];
                count++;
            }
        }
        System.out.println("Sum odd elements = " + sum + "\nQuantity odd elements = " + count);
    }
}
