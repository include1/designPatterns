package com.zm.design.facade;

public class DVDPlayer {

    private static final DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("打开DVD");
    }

    public void play(){
        System.out.println("播放DVD");
    }

    public void off(){
        System.out.println("关闭DVD");
    }
}
