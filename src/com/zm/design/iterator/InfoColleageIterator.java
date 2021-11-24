package com.zm.design.iterator;

import java.util.Iterator;
import java.util.List;

//使用数组保存数据
public class InfoColleageIterator implements Iterator {
    private List<Department> departmentList;
    private int index = -1;

    public InfoColleageIterator(List<Department> departments) {
        this.departmentList = departments;
    }

    @Override
    public boolean hasNext() {

        if (this.index >= departmentList.size() - 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return this.departmentList.get(++index);
    }
}
