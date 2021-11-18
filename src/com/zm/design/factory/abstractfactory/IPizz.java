package com.zm.design.factory.abstractfactory;

//制作Pizz的接口
public abstract class IPizz {

    String name = null;

    public IPizz(){
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
