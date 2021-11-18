package com.zm.design.factory.normalfactory;


public class BJPizzOrder extends Order {
    @Override
    public IPizz createIPizz(String orderType) {
        IPizz iPizz = null;
        if("cheese".equals(orderType)){
            iPizz = new BJCheesePizzFactroy().createBJPizz();
        }else if("greek".equals(orderType)){
            iPizz = new BJGreekPizzFactroy().createBJPizz();
        }
        return iPizz;
    }
}
