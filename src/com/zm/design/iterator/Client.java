package com.zm.design.iterator;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        System.out.println("测试迭代器----模式");
        //创建两个学院
        ComputerColleage computerColleage = new ComputerColleage();
        InfoColleage infoColleage = new InfoColleage();

        OutputImpl output = new OutputImpl();
        output.addColleage(computerColleage);
        output.addColleage(infoColleage);

        output.printColleage();
        System.out.println("----------------------");

        output.printDepartment(new ComputerColleageIterator(new Department[]{
                new Department("1","d"),new Department("d","d")
        }));

     //   new HashSet<>()
    }
}
