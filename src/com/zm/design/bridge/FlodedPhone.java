package com.zm.design.bridge;

public class FlodedPhone extends Brand {

    public FlodedPhone(IPhone iPhone) {
        super(iPhone);
    }

    public void open() {
        super.open();
        System.out.println("翻盖手机");
    }

    public void close() {
        super.close();
        System.out.println("翻盖手机");
    }

    public void call() {
        super.call();
        System.out.println("翻盖手机");
    }
}