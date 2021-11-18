package com.zm.design.prototype.deepclone;

public class DeepCloneTarget implements Cloneable{

    private String name;

    public DeepCloneTarget(String name) {
        this.name = name;
    }

    public DeepCloneTarget(){}
    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "name='" + name + '\'' +
                '}';
    }

    //实现浅拷贝

    @Override
    public Object clone() {
        DeepCloneTarget deepCloneTarget = null;
        try {
            deepCloneTarget = (DeepCloneTarget) super.clone();
            return deepCloneTarget;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
