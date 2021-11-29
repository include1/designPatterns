package com.zm.design.state;

public class DispenseState implements State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }


    @Override
    public void deductMoney() {
        System.out.println("已经扣除50积分");
    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {
        int count = activity.getCount();
        if (count > 0) {
            System.out.println("发送奖品");
            if(count == 1) {
                activity.setState(activity.getDispenseOutState());
                System.exit(1);
            }else{
                activity.setState(activity.getNoRaffleState());
            }
        } else {
            System.out.println("奖品发送完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
