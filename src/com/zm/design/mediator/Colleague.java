package com.zm.design.mediator;

public abstract class Colleague {
     String name;
     Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMessage(int state);

    public Mediator getMediator() {
        return mediator;
    }
}
