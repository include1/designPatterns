package com.zm.design.mediator;

public class TV extends Colleague {

    public TV(String name, Mediator mediator) {
        super(name, mediator);
        mediator.registerColleague(name, this);
    }

    @Override
    public void sendMessage(int state) {
        super.getMediator().getMessage(state, this.name);
    }

    public void on(){
        System.out.println("电视打开");
    }

    public void off(){
        System.out.println("电视关闭");
    }
}
