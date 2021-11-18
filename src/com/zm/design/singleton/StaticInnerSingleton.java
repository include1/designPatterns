package com.zm.design.singleton;

//静态内部类实现单例,懒加载并且是线程安全的
//使用静态内部类的原因
//1.利用jvm类的加载机制来保证初始化实例只用一个线程
//2.类的静态属性只会在类第一次加载时进行初始化，通过jvm帮助下，保证了线程安全性，类进行初始化时，别的线程不会进来
//3.静态内部类方式，在单例类加载时不会立即实例化，当需要实例化是，调用getInstance(),才会装载内部类，并实例化单例类
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return InnerSingleton.instance;
    }

    private static class InnerSingleton {
        private final static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

}

class Main11{
    public static void main(String[] args) {
        StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
        StaticInnerSingleton instance1 = StaticInnerSingleton.getInstance();
        System.out.println(instance == instance1);
    }
}