package com.zm.design.decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public String getDes() {
        return super.getDes() + "\t" + super.getPrice() + " && " + this.obj.getDes() + "\t" + this.obj.getPrice();
    }

    public float cost() {
        return super.getPrice() + this.obj.getPrice();
    }
}
