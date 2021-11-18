package com.zm.design.factory.abstractfactory;

public class FactoryMain {
    public static void main(String[] args) {
        //new Order(new BJFactory());
        new Order(new LDFactory());
    }
}
