package com.zm.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    private List<Colleage> colleageList;

    public OutputImpl() {
        colleageList = new ArrayList<>();
    }

    public void addColleage(Colleage colleage) {
        colleageList.add(colleage);
    }

    //遍历学院
    public void printColleage() {
        Iterator<Colleage> iterator = this.colleageList.iterator();
        while (iterator.hasNext()) {
            Colleage next = iterator.next();
            System.out.println("=====" + next.getName() + "=====");
            this.printDepartment(next.getIterator());
        }
    }

    //遍历部门、系
    public void printDepartment(Iterator iterator) {
        System.out.println("遍历系、部门");
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }
}
