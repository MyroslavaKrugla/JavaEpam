package com.groupqa1.homework6.case1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Books books = new Books(5);
        books.addBook();
        books.showAllBooks();
    }
}
