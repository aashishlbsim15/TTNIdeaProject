package com.demo.spring;

/**
 * Created by hackerfreak on 9/7/17.
 */
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("tea is prepared");
    }
}
