package com.demo.spring;

/**
 * Created by hackerfreak on 9/7/17.
 */
public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Express Tea is prepared");
    }
}
