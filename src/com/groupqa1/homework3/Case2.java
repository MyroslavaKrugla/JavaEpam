package com.groupqa1.homework3;

public class Case2 {
    public static void main (String[] args) {
        int row = 1;
        while (row <=5) {
            int column = 1;
            while (column <= 5) {
                if (row - 1 >= column) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
