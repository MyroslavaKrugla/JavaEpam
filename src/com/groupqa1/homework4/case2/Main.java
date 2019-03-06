package com.groupqa1.homework4.case2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the phrase --> ");
        String phrase = scan.nextLine();
        String unique_char = getUnique(phrase);
        System.out.println("Unique chars --> " + unique_char);
    }
    static String getUnique(String phrase) {
        String charachters = "";
        int index = 0;
        int lenght = phrase.length();
        while (index < lenght) {
            char ch = phrase.charAt(index);
            if (phrase.indexOf(ch) == phrase.lastIndexOf(ch)) {
                charachters = charachters + ch;
            }
            index++;
        }
        return charachters;
    }
}

