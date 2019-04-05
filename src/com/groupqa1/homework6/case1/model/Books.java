package com.groupqa1.homework6.case1.model;

public class Books {
    private Book[] library;
    private int count = 0;

    public Books (int arraySize) {
        this.library = new Book[arraySize];
    }

    public boolean addBook(Book book) {
        if (count >= library.length) {
            return false;
        }
        library[count++] = book;
        return true;
    }

    public String viewBooks() {
        if (count == 0) {
            return "no books";
        }
        String books = "";
        for (int i = 0; i < count; i++) {
            books += library[i].viewBook();
            books += "\n";
        }
        return books;
    }

    public void changePrice(double percent) {
//        System.out.println("Change price by " + percent + "%");
        for (int i = 0; i < count; i++) {
            library[i].changePrice(percent);
        }
    }

    public Books findByAuthor(String author) {
        Books newBook = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getAuthor().equalsIgnoreCase(author)) {
                newBook.addBook(library[i]);
            }
        }
        return newBook;
    }

    public void findByYear(int year) {

    }

}
