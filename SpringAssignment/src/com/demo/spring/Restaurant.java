package com.demo.spring;

public class Restaurant {
    ExpressTea hotDrink;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

    public ExpressTea getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(ExpressTea hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant(ExpressTea hotDrink) {
        this.hotDrink =hotDrink;
    }







    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';

    }
}
