package com.otm.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

/**
 * Created by hackerfreak on 7/7/17.
 */
public class MainClass {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        Book book=new Book().setBookName("Let us C");
        Book book1=new Book().setBookName("E.Balaguru Swami");
        ArrayList<Book> b=new ArrayList<>();
        b.add(book);
        b.add(book1);
        Author author=new Author().setFname("Shubham").setLname("Verma");
        author.setBook(b);
        session.beginTransaction();
        session.save(author);
        /*session.save(book);
        session.save(book1);*/
        session.getTransaction().commit();


        session.beginTransaction();

        Author author1=session.get(Author.class,1);

        System.out.println(author1.getBook());
        System.out.println(author1.getFname());
        System.out.println(author1.getLname());



        session.close();
        sessionFactory.close();

    }
}
