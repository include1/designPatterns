package com.zm.design.mediator;

public class Alarm extends Colleague {

    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        //把信息注册到中介者中
        mediator.registerColleague(name, this);
    }

    @Override
    public void sendMessage(int state) {
        super.getMediator().getMessage(state,this.name);
    }

    public void on(){
        System.out.println("闹钟响了");
    }


}
