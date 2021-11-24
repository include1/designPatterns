package com.zm.design.mediator;

//类似于外观者模式
public class Client {
    public static void main(String[] args) {
        System.out.println("中介者模式---的一个小demo");
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Alarm alarm = new Alarm("alarm",concreteMediator);
        TV tv = new TV("TV",concreteMediator);

        alarm.sendMessage(1);

    }
}
