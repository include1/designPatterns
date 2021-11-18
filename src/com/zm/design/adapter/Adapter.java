package com.zm.design.adapter;

public class Adapter extends Source220V implements Inteferace5V {
    @Override
    public Integer get5V() {
        int desV = getValue() / 44;
        System.out.println("转化成 5V 电压");
        return desV;
    }
}
