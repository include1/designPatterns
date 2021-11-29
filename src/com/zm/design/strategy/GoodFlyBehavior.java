package com.zm.design.strategy;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞的非常好");
    }
}
