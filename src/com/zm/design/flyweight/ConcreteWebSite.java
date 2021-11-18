package com.zm.design.flyweight;

public class ConcreteWebSite extends WebSite {
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("该网站的类型是：" + type + "当前使用用户：" + user.getName());
    }
}
