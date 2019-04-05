package com.groupqa1.homework6.case1.model;

import com.groupqa1.lesson6.case2.ID;

public class Book {
    private String name, author, company;
    private  int ID, year, pages;
    private double price;
    private static  int nextID = 1;


    public Book() {
        this.ID = nextID++;
    }

    public Book(int year, int pages, double price, String name, String author, String company) {
        this();
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.name = name;
        this.author = author;
        this.company = company;
    }

    public int getID() {
        return ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void changePrice(double percent) {
        this.price = price + price * percent / 100;
    }

    public String viewBook() {
        return "Book ID: " + ID + "\nname: " + name + "\nauthor: " + author + "\nyear: " + year + "\npublisher: " +
                        company + "\nquantity of pages: " + pages + "\nprice, UAH: " + price;
    }
}
