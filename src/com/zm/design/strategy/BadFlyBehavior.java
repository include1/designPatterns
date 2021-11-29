package com.zm.design.strategy;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的一般");
    }
}
