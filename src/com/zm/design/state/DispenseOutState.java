package com.zm.design.state;

public class DispenseOutState implements State {
    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了");
        return true;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了");
    }
}
