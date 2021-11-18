package com.zm.design.composite;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        System.out.println("组织架构-组合模式");
        //创建一个大学
        University university = new University("蚌埠大学", "全球顶尖大学");
        //创建学院
        Colleage computerColleage = new Colleage("计算机学院", "");
        Colleage messageColleage = new Colleage("通信学院", "");
        //创建系
        Department department1 = new Department("计算机科学与技术", "");
        Department department2 = new Department("软件工程", "");

        Department message1 = new Department("通信工程", "");
        Department message2 = new Department("通信安全", "");

        computerColleage.add(department1);
        computerColleage.add(department2);

        messageColleage.add(message1);
        messageColleage.add(message2);

        university.add(computerColleage);
        university.add(messageColleage);

        //打印组织结构
        university.print();

//        new HashMap<>()
    }
}
