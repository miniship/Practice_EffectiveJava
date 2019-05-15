package com.tuannnguyen.practice.effectivejava.chapter2;

public class Book {

    private final String author;
    private final String title;
    private final double price;
    private final String publisher;
    private final int publishYear;
    private final String genre;

    private Book(BookBuilder bookBuilder) {
        author = bookBuilder.author;
        title = bookBuilder.title;
        price = bookBuilder.price;
        publisher = bookBuilder.publisher;
        publishYear = bookBuilder.publishYear;
        genre = bookBuilder.genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public static class BookBuilder {
        private final String author;
        private final String title;
        private final double price;
        private String publisher = "";
        private int publishYear = 9999;
        private String genre = "";

        public BookBuilder(String author, String title, double price) {
            this.author = author;
            this.title = title;
            this.price = price;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder publishYear(Integer publishYear) {
            this.publishYear = publishYear;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
