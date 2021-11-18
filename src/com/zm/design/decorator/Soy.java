package com.zm.design.decorator;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        super.setDes("豆浆");
        super.setPrice(0.5f);
    }
}
