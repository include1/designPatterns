package com.zm.design.state;

public class NoRaffleState implements State{

    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分，可以抽奖");
        activity.setState(activity.getCanRaffleState());
    }

    //是否能抽奖
    @Override
    public boolean raffle() {
        return false;
    }

    //是否发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("未抽奖，不能发送奖品");
    }
}
