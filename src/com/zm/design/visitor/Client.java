package com.zm.design.visitor;

public class Client {
    public static void main(String[] args) {
        System.out.println("行为性-访问者模式");

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man("张三",18,new Success()));
        objectStructure.add(new Man("小明",18,new Fail()));
        objectStructure.add(new Woman("小红",18,new Success()));
        objectStructure.add(new Woman("小丽",18,new Fail()));

        objectStructure.display();
    }
}
