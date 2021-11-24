package com.zm.design.mediator;

public abstract class Mediator {

    public abstract void registerColleague(String name, Colleague colleague);

    public abstract void getMessage(int state, String colleagueName);

    public abstract void sendMessage();
}
