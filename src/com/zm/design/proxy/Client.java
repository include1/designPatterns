package com.zm.design.proxy;

import com.zm.design.proxy.staticproxy.TeacherDaoProxy;

//代理类分为三种：静态代理、动态代理、cglib代理
public class Client {
    public static void main(String[] args) {
        System.out.println("代理模式-的实现");
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy();
        teacherDaoProxy.teach();
    }
}
