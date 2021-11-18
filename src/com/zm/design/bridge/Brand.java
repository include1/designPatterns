package com.zm.design.bridge;

import com.zm.design.adapter.Phone;

import java.util.Optional;
//定义为桥接类，实现多对多的关系，防止产生类爆炸问题
public abstract class Brand {
    private IPhone phone;

    public Brand(IPhone phone){
        super();
        this.phone = phone;
    }

    protected void open(){
        this.phone.open();
    }

    protected void close(){
        this.phone.close();
    }

    protected void call(){
        this.phone.call();
    }
}
