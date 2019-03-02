package com.groupqa1.homework3;

public class Case4 {
    public static void main (String[] args) {
        int row = 1;
        while (row <=5) {
            int column = 5;
            while (column >= 1) {
                if (column > row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                column--;
            }
            row++;
            System.out.println();
        }
        int row2 = 2;
        while (row2 <= 5) {
            int column = 1;
            while (column <= 5) {
                if (row2 - 1 >= column) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                column++;
            }
            row2++;
            System.out.println();
        }
    }
}
