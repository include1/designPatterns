package com.zm.design.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        super.setDes("巧克力");
        super.setPrice(1.0f);
    }
}
