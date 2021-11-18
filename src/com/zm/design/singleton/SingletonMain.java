package com.zm.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {
    public static void main(String[] args) throws Exception {
        System.out.println("单例模式");
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton11);
        //测试反射破坏类的封装性
//        Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton1 singleton12 = constructor.newInstance();
//        System.out.println(singleton1 == singleton12);
        //测试序列化和反序列化破坏单例
        //输出对象-》字符串（序列化）
        OutputStream os = new FileOutputStream("D:\\webProject\\designPatterns\\src\\com\\zm\\design\\singleton\\a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(singleton1);

        //反序列化
        InputStream fis = new FileInputStream("D:\\webProject\\designPatterns\\src\\com\\zm\\design\\singleton\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton1 singleton12 = (Singleton1) ois.readObject();
        System.out.println("singleton1" + singleton1);
        System.out.println("singleton12" + singleton12);
    }
}
