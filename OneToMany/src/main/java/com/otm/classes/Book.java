package com.otm.classes;

import javax.persistence.*;

/**
 * Created by hackerfreak on 7/7/17.
 */
@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String bookName;
    @ManyToOne
    Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getRamesh() {
        return author;
    }

    public void setRamesh(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
