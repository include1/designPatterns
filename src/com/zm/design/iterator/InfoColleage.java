package com.zm.design.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoColleage implements Colleage {
    private List<Department> departmentList;
    private int positionNum = 0;

    public InfoColleage() {
        departmentList = new ArrayList<>();
        addDepartment("网络安全", "网络安全");
        addDepartment("信息安全", "信息安全");
        addDepartment("服务器安全", "服务器安全");
    }

    @Override
    public String getName() {
        return "信息安全学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator getIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
