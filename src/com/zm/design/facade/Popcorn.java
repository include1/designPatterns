package com.zm.design.facade;

public class Popcorn {
    private static final Popcorn instance;

    static {
        instance = new Popcorn();
    }

    private Popcorn(){}

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("打开 popcorn");
    }

    public void off(){
        System.out.println("关闭 popcorn");
    }
}
