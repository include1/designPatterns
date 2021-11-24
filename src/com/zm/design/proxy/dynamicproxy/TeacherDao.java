package com.zm.design.proxy.dynamicproxy;

import com.zm.design.proxy.staticproxy.IteacherDao;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("这是目标方法-老师正在授课");
    }
}
