package com.zm.design.facade;

public class Screen {
    private Screen() {
    }

    private volatile static Screen instance = null;

    public static Screen getInstance() {
        if (instance == null) { //主要是为了多线程环境下，第一次实例化完成后，后面线程不需要在进入代码块做判断，节约系统资源，提高响应速度
            synchronized (Screen.class) {//第一个线程加锁，实现线程同步保证数据一致性。
                if (instance == null) {
                    instance = new Screen();
                }
            }
        }
        return instance;
    }

    public void on (){
        System.out.println("Screen on");
    }

    public void off (){
        System.out.println("Screen off");
    }
}
