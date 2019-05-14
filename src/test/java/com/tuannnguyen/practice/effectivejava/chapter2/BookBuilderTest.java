package com.tuannnguyen.practice.effectivejava.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BookBuilderTest {

    @Test
    public void init() {
        Book book = BookBuilder.init().build();

        Assert.assertNull(book.getAuthor());
        Assert.assertNull(book.getTitle());
        Assert.assertNull(book.getPrice());
        Assert.assertNull(book.getPublisher());
        Assert.assertNull(book.getPublishYear());
        Assert.assertNull(book.getGenre());
    }

    @Test
    public void author() {
        Book book = BookBuilder.init()
                .author("Tuan Nguyen")
                .build();

        Assert.assertEquals("Tuan Nguyen", book.getAuthor());
    }

    @Test
    public void title() {
        Book book = BookBuilder.init()
                .title("Fun is fun")
                .build();

        Assert.assertEquals("Fun is fun", book.getTitle());
    }

    @Test
    public void price() {
        Book book = BookBuilder.init()
                .price(10.0)
                .build();

        Assert.assertEquals(Double.valueOf(10.0), book.getPrice());
    }

    @Test
    public void publisher() {
        Book book = BookBuilder.init()
                .publisher("Future publisher")
                .build();

        Assert.assertEquals("Future publisher", book.getPublisher());
    }

    @Test
    public void publishYear() {
        Book book = BookBuilder.init()
                .publishYear(9999)
                .build();

        Assert.assertEquals(Integer.valueOf(9999), book.getPublishYear());
    }

    @Test
    public void genre() {
        Book book = BookBuilder.init()
                .genre("Comedy")
                .build();

        Assert.assertEquals("Comedy", book.getGenre());
    }

    @Test
    public void build() {
        Book book = BookBuilder.init()
                .author("Tuan Nguyen")
                .title("Fun is fun")
                .price(10.0)
                .publisher("Future publisher")
                .publishYear(9999)
                .genre("Comedy")
                .build();

        Assert.assertEquals("Tuan Nguyen", book.getAuthor());
        Assert.assertEquals("Fun is fun", book.getTitle());
        Assert.assertEquals(Double.valueOf(10.0), book.getPrice());
        Assert.assertEquals("Future publisher", book.getPublisher());
        Assert.assertEquals(Integer.valueOf(9999), book.getPublishYear());
        Assert.assertEquals("Comedy", book.getGenre());
    }
}