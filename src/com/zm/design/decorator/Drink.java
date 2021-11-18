package com.zm.design.decorator;

public abstract class Drink {
    private String des;
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //定义一个抽象方法
    public abstract float cost();
}
