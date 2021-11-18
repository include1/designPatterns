package com.zm.design.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("设计模式-适配器模式");
        //使用类适配
//        Phone phone = new Phone();
////        phone.charging(new Adapter());
        //对象适配
        Phone phone = new Phone();
        phone.charging(new ObjectAdapter(new Source220V()));
        //接口适配
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("调用了m1");
            }
        };
        absAdapter.m1();

    }
    public  interface innerInterface{
        default void test(){
            System.out.println("默认方法");
        }
    }
}
