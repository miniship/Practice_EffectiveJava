package com.tuannnguyen.practice.effectivejava.chapter2.builderpattern;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookTest {

    @Test
    public void build() {
        Book book = new Book.Builder()
                .author("Tuan Nguyen")
                .title("Fun is fun")
                .year(1999)
                .build();

        Assert.assertEquals("Tuan Nguyen", book.getAuthor());
        Assert.assertEquals("Fun is fun", book.getTitle());
        Assert.assertEquals(1999, book.getYear());
    }

    @Test
    public void author() {
        Book book = new Book.Builder()
                .author("Tuan Nguyen")
                .build();

        Assert.assertEquals("Tuan Nguyen", book.getAuthor());
    }

    @Test
    public void title() {
        Book book = new Book.Builder()
                .title("Fun is fun")
                .build();

        Assert.assertEquals("Fun is fun", book.getTitle());
    }

    @Test
    public void year() {
        Book book = new Book.Builder()
                .year(1999)
                .build();

        Assert.assertEquals(1999, book.getYear());
    }
}