package com.zm.design.factory.normalfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Order {

    public Order() {
        do {
            String type = getType();
            IPizz iPizz = createIPizz(type);
            if (iPizz != null) {
                create(iPizz);
            } else {
                System.out.println("退出");
                break;
            }

        } while (true);
    }

    public abstract IPizz createIPizz(String orderType);

    private String getType() {
        System.out.println("使用工厂方法创建");
        System.out.println("请输入订单类型：");
        String s = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void create(IPizz iPizz) {
        iPizz.prepare();
        iPizz.bake();
        iPizz.cut();
        iPizz.box();
    }
}
