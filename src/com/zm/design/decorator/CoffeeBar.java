package com.zm.design.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        System.out.println("欢迎-来到咖啡店----装饰者模式 实现");
        //创建一个shortBlack
        Drink order = new ShortBlack();
        System.out.println("一杯咖啡 费用：" + order.cost());
        System.out.println("描述：" + order.getDes());
        System.out.println("-------------------------------------------");
        //添加一份牛奶
        order = new Milk(order);
        System.out.println("添加一份牛奶 费用：" + order.cost());
        System.out.println("描述：" + order.getDes());
        System.out.println("-------------------------------------------");
        //添加一份巧克力
        order = new Chocolate(order);
        System.out.println("添加一份巧克力和一份牛奶 费用：" + order.cost());
        System.out.println("描述：" + order.getDes());
        System.out.println("-------------------------------------------");
    }
}
