package com.zm.design.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//下订单
public class OrderPizz {
//    public OrderPizz() {
//        System.out.println("--------进入下订单页面------");
//        IPizz iPizz = null;
//        String orderType = "";
//        do {
//            orderType = getType();
//            if ("greek".equals(orderType)) {
//                iPizz = new GreekPizz();
//            } else if ("cheese".equals(orderType)) {
//                iPizz = new CheesePizz();
//            } else {
//                System.out.println("退出订单页面-----------");
//                break;
//            }
//            //制作
//            create(iPizz);
//        } while (true);
//    }

    public OrderPizz(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    private SimpleFactory simpleFactory;


    public void setSimpleFactory(SimpleFactory simpleFactory){

        this.simpleFactory = simpleFactory;

        do {
            String type = getType();
            //创建产品对象
            IPizz pizz = this.simpleFactory.createPizz(type);
            //制作
            if (pizz != null) {
                this.simpleFactory.create(pizz);
            }else {
                System.out.println("退出");
                break;
            }
        }while (true);


    }

    private String getType() {
        System.out.println("使用简单工厂创建");
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

    public void purchase(IPizz iPizz) {

        if (iPizz instanceof CheesePizz) {
            create((CheesePizz) iPizz);
        } else if (iPizz instanceof GreekPizz) {
            create((GreekPizz) iPizz);
        } else {
            System.out.println("请选择商品");
        }
    }
    public void create(IPizz iPizz) {
        iPizz.prepare();
        iPizz.bake();
        iPizz.cut();
        iPizz.box();
    }
}
