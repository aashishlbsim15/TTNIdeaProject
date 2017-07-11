package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by hackerfreak on 9/7/17.
 */
public class MainClass {
    public static void main(String[] args) {
            ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
            Database database=context.getBean("database",Database.class);
        Restaurant restaurant=context.getBean("teaRestaurant",Restaurant.class);
        restaurant.setX(25);
        System.out.println("value of X from restaurant "+restaurant.getX());
        Restaurant restaurant1=context.getBean("teaRestaurant",Restaurant.class);
        System.out.println("value of X from restaurant1 "+restaurant1.getX());
        Complex complex=context.getBean("complexBean",Complex.class);





        System.out.println("----------List-----------");
        for (Object o:complex.getList()
             ) {
            System.out.println(o);
        }

        System.out.println("----------Set-----------");
        for (Object o:complex.getSet()) {
            System.out.println(o);
        }
        System.out.println("----------Map-----------");
        for (Object e:complex.getMap().entrySet()) {
            System.out.println(e);
        }
        restaurant.getHotDrink().prepareHotDrink();
        System.out.println(database);
    }
}
