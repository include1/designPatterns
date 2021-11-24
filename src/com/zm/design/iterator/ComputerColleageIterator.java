package com.zm.design.iterator;

import java.util.Iterator;

//使用数组保存数据
public class ComputerColleageIterator implements Iterator {
    private Department[] departments;
    private int position = 0;

    public ComputerColleageIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {

        if (position >= this.departments.length || this.departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return this.departments[position++];
    }
}
