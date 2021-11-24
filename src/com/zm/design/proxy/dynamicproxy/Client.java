package com.zm.design.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用JDK实现动态代理");
        //创建一个目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建有一个代理工厂，生成一个对象对象
        DynamicProxyFactory proxyFactory = new DynamicProxyFactory(teacherDao);
        ITeacherDao proxyInstace = (ITeacherDao) proxyFactory.getProxyInstace();
        proxyInstace.teach();
    }
}
