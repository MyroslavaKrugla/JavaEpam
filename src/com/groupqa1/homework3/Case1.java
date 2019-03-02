package com.groupqa1.homework3;

public class Case1 {
    public static void main (String[] args) {
        int row = 1;
        while (row < 6) {
          int number = row;
          while (number >=1) {
              System.out.print("* ");
              number--;
          }
          row++;
          System.out.println();
        }
        int row2 = 4;
        while (row2 >=1) {
            int number2 = row2;
            while (number2 >= 1) {
                System.out.print("* ");
                number2--;
            }
            row2--;
            System.out.println();
        }

    }
}
