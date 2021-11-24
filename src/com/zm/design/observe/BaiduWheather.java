package com.zm.design.observe;

//第三方
public class BaiduWheather implements Observe {

    private float tempureture;
    private float pressure;
    private float humidity;

    @Override
    public void update(float tempureture, float pressure, float humidity) {
        this.tempureture = tempureture;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("baidu天气温度：" + this.tempureture);
        System.out.println("baidu天气压强：" + this.pressure);
        System.out.println("baidu天气湿度：" + this.humidity);

    }
}
