package com.zm.design.factory.abstractfactory;

public class LDFactory implements AbsFactory {
    @Override
    public IPizz createPizz(String orderType) {
        IPizz iPizz = null;
        if("cheese".equals(orderType)){
            iPizz = new LDCheesePizz();
            iPizz.name = "伦敦奶酪披萨";
        }else if("greek".equals(orderType)){
            iPizz = new LDGreekPizz();
            iPizz.name = "伦敦希腊披萨";
        }
        return iPizz;
    }
}
