package com.zm.design.observe;

public class Client {
    public static void main(String[] args) {
        System.out.println("观察者模式-的demo");

        CurrentWheather currentWheather = new CurrentWheather();
        WheatherData wheatherData = new WheatherData();
        wheatherData.registerObserve(currentWheather);

        wheatherData.setWheatherData(22.0f, 100.0f, 56f);

        //创建百度第三方获取最新天气
        BaiduWheather baiduWheather = new BaiduWheather();
        wheatherData.registerObserve(baiduWheather);

        wheatherData.notifyObserves();
    }
}
