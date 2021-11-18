package com.zm.design.factory.abstractfactory;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    //聚合
    private AbsFactory absFactory = null;

    public Order(AbsFactory absFactory) {
        this.setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory){
        String type = "";
        if(absFactory != null) {
            this.absFactory = absFactory;
            do {
                //获取该类型pizz
                IPizz pizz = this.absFactory.createPizz(getType());
                if(pizz != null){
                    this.create(pizz);
                }else{
                    System.out.println("程序退出");
                    break;
                }

            } while (true);
        }
    }

    public String getType(){
        System.out.println("使用抽象工厂");
        System.out.println("请输入类型：");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
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
