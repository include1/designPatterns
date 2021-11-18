package com.zm.design.proxy.staticproxy;

public class TeacherDao implements IteacherDao {

    @Override
    public void teach() {
        System.out.println("老师开始教学");
    }
}
