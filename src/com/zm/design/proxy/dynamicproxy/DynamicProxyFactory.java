package com.zm.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {
    private ITeacherDao target;

    public DynamicProxyFactory(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }

    //提供一个获取代理类的实例
    public Object getProxyInstace() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            //proxy: 代理对象
            //method: 目标对象的方法
            //args: 传入目标对象的参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk代理-目标方法执行之前");
                Object invoke = method.invoke(target, args);
                System.out.println("jdk代理-目标方法执行之后");
                return invoke;
            }
        });
    }
}
