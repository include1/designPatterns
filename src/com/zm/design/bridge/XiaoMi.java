package com.zm.design.bridge;

public class XiaoMi implements IPhone{
    @Override
    public void open() {
        System.out.println("XiaoMi手机打开");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi手机关闭");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi手机通话");
    }
}
