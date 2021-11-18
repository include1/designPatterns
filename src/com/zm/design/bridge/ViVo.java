package com.zm.design.bridge;

public class ViVo implements IPhone {
    @Override
    public void open() {
        System.out.println("vivo手机打开");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关闭");
    }

    @Override
    public void call() {
        System.out.println("vivo手机通话");
    }
}
