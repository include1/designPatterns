package com.zm.design.factory.abstractfactory;

public class LDGreekPizz extends IPizz {

    @Override
    public void prepare() {
        System.out.println("制作" + name + "的原材料准备");
    }

    @Override
    public void bake() {
        System.out.println("制作" + name + "的烤制");
    }

    @Override
    public void cut() {
        System.out.println("制作" + name + "的分割");
    }

    @Override
    public void box() {
        System.out.println("制作" + name + "的打包");
    }

    public void setName(String name){
        super.name = name;
    }
}
