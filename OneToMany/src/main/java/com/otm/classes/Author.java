package com.otm.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackerfreak on 7/7/17.
 */
@Entity
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String fname;
    private String lname;

    /*@JoinTable(joinColumns = @JoinColumn(name="user_id")
            ,inverseJoinColumns = @JoinColumn(name = "book_id"))*/
    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
    private List<Book> book=new ArrayList<>();




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public Author setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public Author setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public List<Book> getBook() {
        return book;
    }

    public Author setBook(List<Book> book) {
        this.book = book;
        return this;
    }



}
