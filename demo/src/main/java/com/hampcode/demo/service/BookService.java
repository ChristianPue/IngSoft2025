package com.hampcode.demo.service;

import com.hampcode.demo.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService
{
    // Como no hay una base de datos. Utilizaremos esta siguiente lista
    private List<Book> books = new ArrayList<Book>();
    private Long currentId = 0L;

    // Lista todos los libros
    public List<Book> getAllBooks()
    {
        return books;
    }

    // Registrar un libro
    public Book createBook(Book book)
    {
        book.setId(++currentId);
        books.add(book);
        return book;
    }

    //
}
