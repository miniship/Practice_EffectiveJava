package com.tuannnguyen.practice.effectivejava.chapter2.builderpattern;

public class Book {
    private String author;
    private String title;
    private int year;

    private Book(Builder builder) {
        this.author = builder.author;
        this.title = builder.title;
        this.year = builder.year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public static class Builder {
        private String author;
        private String title;
        private int year;

        public Book build() {
            return new Book(this);
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }
    }
}