package com.zm.design.prototype.deepclone;

public class DeepCloneableMain {
    public static void main(String[] args) {
        System.out.println("深拷贝的两种实现方式：clone、序列化");
        DeepCloneTarget target = new DeepCloneTarget("目标对象");
        DeepClonePrototype deepClonePrototype = new DeepClonePrototype("原型对象", target);
        DeepClonePrototype clone = (DeepClonePrototype)deepClonePrototype.clone();
        System.out.println(deepClonePrototype.toString() + deepClonePrototype.deepCloneTarget.hashCode());
        System.out.println(clone.toString() + clone.deepCloneTarget.hashCode());
    }
}
