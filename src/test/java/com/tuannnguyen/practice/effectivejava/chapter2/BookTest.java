package com.tuannnguyen.practice.effectivejava.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookTest {

    @Test
    public void build() {
        Book book = new Book.BookBuilder("Tuan Nguyen", "Fun is fun", 10.0)
                .publisher("Future publisher")
                .publishYear(9999)
                .genre("Comedy")
                .build();

        Assert.assertEquals("Tuan Nguyen", book.getAuthor());
        Assert.assertEquals("Fun is fun", book.getTitle());
        Assert.assertEquals(10.0, book.getPrice(), 0);
        Assert.assertEquals("Future publisher", book.getPublisher());
        Assert.assertEquals(9999, book.getPublishYear());
        Assert.assertEquals("Comedy", book.getGenre());
    }

    @Test
    public void publisher() {
        Book book = new Book.BookBuilder("Tuan Nguyen", "Fun is fun", 10.0)
                .publisher("Future publisher")
                .build();

        Assert.assertEquals("Future publisher", book.getPublisher());
    }

    @Test
    public void publishYear() {
        Book book = new Book.BookBuilder("Tuan Nguyen", "Fun is fun", 10.0)
                .publishYear(2019)
                .build();

        Assert.assertEquals(2019, book.getPublishYear());
    }

    @Test
    public void genre() {
        Book book = new Book.BookBuilder("Tuan Nguyen", "Fun is fun", 10.0)
                .genre("Comedy")
                .build();

        Assert.assertEquals("Comedy", book.getGenre());
    }
}