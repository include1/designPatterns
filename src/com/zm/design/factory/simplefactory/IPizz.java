package com.zm.design.factory.simplefactory;

//制作Pizz的接口
public interface IPizz {
    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
