package com.zm.design.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用模板方法");
        //花生牛奶豆浆
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("*************************");
        //制作纯豆浆
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
