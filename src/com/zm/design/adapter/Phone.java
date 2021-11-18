package com.zm.design.adapter;

public class Phone {
    public Phone() {
    }
    public void charging(Inteferace5V adapter){
        if (5 == adapter.get5V()) {
            System.out.println("电压是5v,可以充电");
        } else {
            System.out.println("电压不是5V,该充电器无法适配");
        }
    }

}
