package com.zm.design.visitor;

public class Man extends Person {

    private Action action;

    public Man(String name,Integer age,Action action){
        super(name,age);
        this.action = action;
    }

    @Override
    public void accpet() {
        this.action.getManResult();
    }
}
