package com.zm.design.factory.simplefactory;

public class GreekPizz implements IPizz {
    @Override
    public void prepare() {
        System.out.println("制作GreekPizz的原材料准备");
    }

    @Override
    public void bake() {
        System.out.println("制作GreekPizz的烤制");
    }

    @Override
    public void cut() {
        System.out.println("制作GreekPizz的分割");
    }

    @Override
    public void box() {
        System.out.println("制作GreekPizz的打包");
    }
}
