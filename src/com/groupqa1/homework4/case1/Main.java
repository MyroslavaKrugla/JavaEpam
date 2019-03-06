package com.groupqa1.homework4.case1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your integer number --> ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Binary code for " + number + " is --> "+ Integer.toBinaryString(number));
    }
}
