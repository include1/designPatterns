package com.zm.design.state;

import java.util.Random;

public class CanRaffleState implements State {
    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除50积分");
    }

    @Override
    public boolean raffle() {
        Random random = new Random();
        int nextInt = random.nextInt(10);
        if (nextInt == 0) {
            System.out.println("中奖了！！！");
            //修改状态
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，没中奖 o(╥﹏╥)o");
            activity.setState(activity.getNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("暂时未中奖，不能发送奖品");
    }
}
