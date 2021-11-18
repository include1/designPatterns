package com.zm.design.bridge;

public class UnRightPhone extends Brand {

    public UnRightPhone(IPhone iPhone) {
        super(iPhone);

    }

    public void open() {
        super.open();
        System.out.println("折叠手机");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
