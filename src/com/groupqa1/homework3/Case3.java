package com.groupqa1.homework3;

public class Case3 {
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
    }
}
