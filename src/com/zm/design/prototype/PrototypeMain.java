package com.zm.design.prototype;
/*
* 浅拷贝：需要重写Object的clone方法，只能复制当前对象的可拷贝的属性和方法，引用类型无法复制
* 深拷贝：可以拷贝引用类型的属性和方法
* */
public class PrototypeMain {
    public static void main(String[] args) {
        System.out.println("设计模式-原型模式");
        Sheep sheep = new Sheep("多利", 22,new Sheep("多利朋友",22));
        Sheep clone = (Sheep)sheep.clone();
        System.out.println(sheep.toString()+ sheep.getFriend().hashCode());
        System.out.println(clone.toString()+ clone.getFriend().hashCode());

    }
}
