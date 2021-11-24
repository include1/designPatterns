package com.zm.design.proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用cglib框架实现动态代理");
        TeacherDao teacherDao = new TeacherDao();
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(teacherDao);
        TeacherDao proxyInstace = (TeacherDao) cglibProxyFactory.getProxyInstace();
        proxyInstace.teach();
    }
}
