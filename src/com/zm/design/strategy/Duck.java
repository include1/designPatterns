package com.zm.design.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();

    public  void swim(){
        System.out.println("鸭子能游泳");
    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void fly(){
       if(this.flyBehavior != null){
           this.flyBehavior.fly();
       }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
