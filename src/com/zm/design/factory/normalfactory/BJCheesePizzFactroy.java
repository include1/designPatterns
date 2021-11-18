package com.zm.design.factory.normalfactory;

public class BJCheesePizzFactroy implements AbstractBJFactory {
    @Override
    public IPizz createBJPizz() {
        BJCheesePizz bjCheesePizz = new BJCheesePizz();
        bjCheesePizz.setName("北京奶酪披萨");
        return bjCheesePizz;
    }
}
