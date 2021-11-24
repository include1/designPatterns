package com.zm.design.visitor;

public class Success extends Action {
    @Override
    public void getManResult() {
        System.out.println("男观众评价为成功");
    }

    @Override
    public void getWomanResult() {
        System.out.println("女观众评价为成功");
    }
}
