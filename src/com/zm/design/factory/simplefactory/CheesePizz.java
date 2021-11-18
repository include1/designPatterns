package com.zm.design.factory.simplefactory;

public class CheesePizz implements IPizz {
    @Override
    public void prepare() {
        System.out.println("制作CheesePizz的原材料准备");
    }

    @Override
    public void bake() {
        System.out.println("制作CheesePizz的烤制");
    }

    @Override
    public void cut() {
        System.out.println("制作CheesePizz的分割");
    }

    @Override
    public void box() {
        System.out.println("制作CheesePizz的打包");
    }
}
