package com.zm.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    //定义一个集合，保存人
    List<Person> list = new ArrayList<>();

    //添加操作
    public void add(Person person) {
        list.add(person);
    }

    //删除
    public void remove(Person person) {
        list.remove(person);
    }

    //展示
    public void display() {
        for (Person p : list) {
            System.out.println("名字：" + p.getName() + "\t年龄：" + p.getAge());
            System.out.println("评价内容：");
            p.accpet();
            System.out.println("**********************************************");
        }
    }
}
