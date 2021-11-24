package com.zm.design.iterator;


import java.util.Iterator;

public class ComputerColleage implements Colleage {
    private Department[] departments;
    private int positionNum = 0;

    public ComputerColleage(){
        departments = new Department[5];
        addDepartment("软件工程","软件工程");
        addDepartment("计算机科学与技术","计算机科学与技术");
        addDepartment("网络工程","网络工程");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[positionNum++] = department;
    }

    @Override
    public Iterator getIterator() {
        return new ComputerColleageIterator(departments);
    }
}
