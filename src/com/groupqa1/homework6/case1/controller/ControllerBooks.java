package com.groupqa1.homework6.case1.controller;

import com.groupqa1.homework6.case1.model.Book;
import com.groupqa1.homework6.case1.model.Books;
import com.groupqa1.homework6.case1.view.ViewBooks;

public class ControllerBooks {
    private Books books;
    private ViewBooks viewBooks = new ViewBooks();



    public void run() {
        viewBooks.print("Enter size -> ");
        books = new Books(InputUtil.inputInt());
//        наполнение модели Books наполение хранилища книгами
        viewBooks.print(books.viewBooks());
        viewBooks.print("\nEnter percent -> ");
        books.changePrice(InputUtil.inputInt()); // поменять на другой метод - досоздать
        viewBooks.print(books.viewBooks());

        Books nBooks = books.findByAuthor("");
        viewBooks.print(nBooks.viewBooks());
    }
}
