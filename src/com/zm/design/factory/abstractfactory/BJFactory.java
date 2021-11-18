package com.zm.design.factory.abstractfactory;

import com.zm.design.factory.normalfactory.AbstractBJFactory;

public class BJFactory implements AbsFactory {
    @Override
    public IPizz createPizz(String orderType) {
        IPizz iPizz = null;
        if("cheese".equals(orderType)){
            iPizz = new BJCheesePizz();
            iPizz.name = "北京奶酪披萨";
        }else if("greek".equals(orderType)){
            iPizz = new BJGreekPizz();
            iPizz.name = "北京希腊披萨";
        }
        return iPizz;
    }
}
