package com.zm.design.factory.simplefactory;

public class SimpleFactory {

    public SimpleFactory() {
    }

    public IPizz createPizz(String orderType) {
        IPizz iPizz = null;
        if ("greek".equals(orderType)) {
            iPizz = new GreekPizz();
        } else if ("cheese".equals(orderType)) {
            iPizz = new CheesePizz();
        }
        return iPizz;
    }

    public void create(IPizz iPizz) {
        iPizz.prepare();
        iPizz.bake();
        iPizz.cut();
        iPizz.box();
    }
}
