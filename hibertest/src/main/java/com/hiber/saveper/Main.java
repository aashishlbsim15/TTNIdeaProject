package com.hiber.saveper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hackerfreak on 11/7/17.
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Employee e=new Employee();
        e.setName("raam");
        session.persist(e);
        e.setName("laxman");

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}