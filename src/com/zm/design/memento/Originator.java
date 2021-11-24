package com.zm.design.memento;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //把当前对象状态保存到备忘录对象中
    public Memento saveOriginatorToMemento() {
        return new Memento(state);
    }

    //从备忘录中获取原始对象状态
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
