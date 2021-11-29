package com.zm.design.strategy;

import java.io.Serializable;

public class Man extends Person implements Serializable {

    public Man(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
