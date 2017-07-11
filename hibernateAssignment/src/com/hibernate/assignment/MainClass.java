package com.hibernate.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

/**
 * Created by hackerfreak on 5/7/17.
 */
public class MainClass {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Author author=new Author().setAge(23).setFname("Yashwant").setLname("Kenetkar");
        Session dbOperation= sessionFactory.openSession();
        dbOperation.beginTransaction();
        dbOperation.save(author);
        dbOperation.getTransaction().commit();
        dbOperation.close();

    }
}
