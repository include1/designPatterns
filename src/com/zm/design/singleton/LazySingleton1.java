package com.zm.design.singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//懒汉式
//使用一个简单的方式创建该实例
//缺点：在多线程环境下产生线程不安全问题
public class LazySingleton1 {

    private volatile static LazySingleton1 instance;//volatile，防止jvm实例化时，指令重排。对象没有进行初始化操作
   // private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private LazySingleton1() {
    }

    public  static LazySingleton1 getInstance() {

        if (instance == null) {//第一个判断instance是否为null，为了防止进行重复加锁操作，提高cpu执行的效率
            synchronized (LazySingleton1.class){//static锁
                if(instance == null) {//获取锁的线程判断是否null，是否进行实例化操作
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new LazySingleton1();
                }
            }
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        //单线程环境下
//        LazySingleton1 instance = LazySingleton1.getInstance();
//        LazySingleton1 instance1 = LazySingleton1.getInstance();
//        System.out.println(instance == instance1);
        //多线程环境下
        System.out.println("多线程环境下-------------------");
        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    LazySingleton1 instance = LazySingleton1.getInstance();
                    System.out.println(Thread.currentThread().getName() + "\t" + instance.hashCode() + "\t");
                }
            }).start();

        }

    }
}