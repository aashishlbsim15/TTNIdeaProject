package com.hibernate.assignment;

import javax.persistence.*;

/**
 * Created by hackerfreak on 5/7/17.
 */
@Entity(name="AuthorTable")
public class Author {
    public Integer getId() {
        return id;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    Integer id;
    @Column(name="First_Name")
    String fname;
    @Column(name="Last_Name")
    String lname;
    Integer age;



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

    public Integer getAge() {
        return age;
    }

    public Author setAge(Integer age) {
        this.age = age;
        return this;

    }
}
