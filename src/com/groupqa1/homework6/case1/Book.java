package com.groupqa1.homework6.case1;

public class Book {
    private String name, author, company;
    private  int ID, year, pages, price;

    public Book() {
    }

    public Book(int ID, int year, int pages, int price, String name, String author, String company) {
        this.ID = ID;
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

    public void setID(int ID) {
        this.ID = ID;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public void view() {
        System.out.println("Book ID: " + ID + "\nname: " + name + "\nauthor: " + author + "\nyear: " + year + "\npublisher: " +
                        company + "\nquantity of pages: " + pages + "\nprice, UAH: " + price);
    }
}
