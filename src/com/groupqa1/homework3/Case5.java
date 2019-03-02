package com.groupqa1.homework3;

public class Case5 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 2) {
            int row = 1;
            while (row <= 5) {
                int column = 1;
                while (column <= 9) {
                    if (column <= 5) {
                        if (column + row > 5) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    } else {
                        if (column - row < 5) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    column++;
                }
                row++;
                System.out.println();
            }
            n++;
        }

    }
}
