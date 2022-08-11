package com.banulp.graphqltoy.graphqltoy.model;

public class Book {
    private Integer id;
    private String title;
    private Integer pages;
    private Rating rating;
    private Author author;

    public Book(Integer id, String title, Integer pages, Rating rating, Author author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.rating = rating;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
