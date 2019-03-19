package com.groupqa1.homework6.case1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setID(123);
        book1.setName("Pride and Prejudice");
        book1.setAuthor("Jane Austen");
        book1.setPages(563);
        book1.setYear(1813);
        book1.setCompany("Whitehall");
        book1.setPrice(1000);
        book1.view();
    }
}
