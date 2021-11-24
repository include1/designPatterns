package com.zm.design.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private TeacherDao target;

    public CglibProxyFactory(TeacherDao target) {
        this.target = target;
    }

    public Object getProxyInstace() {
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //添加父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //返回实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("使用cglib代理");
        System.out.println("目标对象执行之前");
        Object invoke = method.invoke(target, objects);
        System.out.println("目标对象执行之后");
        return invoke;
    }
}
