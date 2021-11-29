package com.zm.design.strategy;

public class ToyDuck extends Duck {

    public ToyDuck(){
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
