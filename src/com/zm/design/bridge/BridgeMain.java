package com.zm.design.bridge;

import java.sql.Driver;

public class BridgeMain {
    public static void main(String[] args) {
        System.out.println("桥接模式");
        //小米-翻盖手机
        FlodedPhone flodedPhone = new FlodedPhone(new XiaoMi());
        flodedPhone.open();
        flodedPhone.close();
        flodedPhone.call();

        //vivo-折叠手机
        UnRightPhone unRightPhone = new UnRightPhone(new ViVo());
        unRightPhone.open();
        unRightPhone.call();
        unRightPhone.close();

      //Driver
    }
}
