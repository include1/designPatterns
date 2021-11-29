package com.zm.design.strategy;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("一个策略模式的demo");

//        WildDuck wildDuck = new WildDuck();
//        wildDuck.display();
//        wildDuck.setFlyBehavior(new NoFlyBehavior());
//        wildDuck.fly();
        System.out.println("----------测试对人的抽象");
        Man man = new Man("朱绍坤", 11, "男");

        // OutputStream outputStream = new FileOutputStream(new File("C://"));
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\object.txt")));
//        objectOutputStream.writeObject(man);

        OutputStream stringWriter = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\object.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(stringWriter);
        byte[] bytes = new byte[1024];
        String s = new String("朱绍坤");
        bytes = s.getBytes();
        int b = s.length();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        stringWriter.close();
        System.out.println(man.toString());
    }
}
