package com.zm.design.factory.normalfactory;

public class BJGreekPizzFactroy implements AbstractBJFactory {
    @Override
    public IPizz createBJPizz() {
        BJGreekPizz bjGreekPizz = new BJGreekPizz();
        bjGreekPizz.setName("北京Greek披萨");
        return bjGreekPizz;
    }
}
