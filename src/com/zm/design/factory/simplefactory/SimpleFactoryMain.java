package com.zm.design.factory.simplefactory;
/*
* 项目需求：要便于披萨种类的扩展，要便于维护
* 披萨的种类有很多（比如：GreekPizz、CheesePizz等）
* 披萨的制作有：prepare、bake、cut、box
* 完成披萨订购功能
*
* */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        //该代码只能实现单个商品的订阅，不能实现多个多个商品订阅
        //购买GreekPizz
       new OrderPizz(new SimpleFactory());

    }
}
