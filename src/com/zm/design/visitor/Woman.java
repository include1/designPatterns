package com.zm.design.visitor;

public class Woman extends Person {
    private Action action;

    public Woman(String name, Integer age, Action action) {
        super(name, age);
        this.action = action;
    }

    @Override
    public void accpet() {
        this.action.getWomanResult();
    }
}
