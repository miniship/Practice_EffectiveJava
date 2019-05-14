package com.tuannnguyen.practice.effectivejava.chapter2;

import org.springframework.stereotype.Component;

@Component
public class BookBuilder {

    private Book book;

    private BookBuilder() {
    }

    public static BookBuilder init() {
        BookBuilder bookBuilder = new BookBuilder();
        bookBuilder.book = new Book();
        return bookBuilder;
    }

    public BookBuilder author(String author) {
        this.book.setAuthor(author);
        return this;
    }

    public BookBuilder title(String title) {
        this.book.setTitle(title);
        return this;
    }

    public BookBuilder price(Double price) {
        this.book.setPrice(price);
        return this;
    }

    public BookBuilder publisher(String publisher) {
        this.book.setPublisher(publisher);
        return this;
    }

    public BookBuilder publishYear(Integer publishYear) {
        this.book.setPublishYear(publishYear);
        return this;
    }

    public BookBuilder genre(String genre) {
        this.book.setGenre(genre);
        return this;
    }

    public Book build() {
        return this.book;
    }

}
