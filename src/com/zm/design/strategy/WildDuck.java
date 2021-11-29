package com.zm.design.strategy;

public class WildDuck extends Duck {

    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭子");
    }
}
