package com.groupqa1.homework5.case4;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        int[] array = getArray(size);
        System.out.println();

        int[] positiveArray = new int[size];
        int[] negativeArray = new int[size];

        createPosAndNegArray(array, positiveArray, negativeArray);

        System.out.println("Positive");
        printArray(positiveArray);

        System.out.println("Negative");
        printArray(negativeArray);
    }

    private static void createPosAndNegArray(int[] array, int[] positiveArray, int[] negativeArray) {
        int k = 0, m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                negativeArray[k] = array[i];
                k++;
            } else {
                positiveArray[m] = array[i];
                m++;
            }
        }
    }

    static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 30 - 10);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
