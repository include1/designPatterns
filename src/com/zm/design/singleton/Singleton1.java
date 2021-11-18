package com.zm.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
//饿汉式
//使用静态属性来实例化对象，利用了jvm加载机制，是一个线程安全的单例模式
public class Singleton1 implements Serializable {

    private final static Singleton1 singleton1 = new Singleton1();
    //也可以使用静态代码块进行初始化时完成类的实例化
//    static {
//        singleton1 = new Singleton1();
//    }

    private Singleton1() {
        //做判断，防止反射来调用构造器
//        if (singleton1 != null) {
//           throw new RuntimeException();
//        }
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

    //放在反序列化生成该类新的实例
    private Object readResolve() throws ObjectStreamException {
        return singleton1;
    }
}
