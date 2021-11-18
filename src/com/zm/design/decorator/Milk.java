package com.zm.design.decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDes("牛奶");
        super.setPrice(2.0f);
    }
}
