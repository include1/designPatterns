package com.zm.design.state;

public class RaffleActivity {

    private State state;
    private int count = 0;

    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private DispenseState dispenseState = new DispenseState(this);
    private DispenseOutState dispenseOutState = new DispenseOutState(this);

    public void deraseMoney() {
        this.state.deductMoney();
    }

    public void dispensePrize() {
        if(this.state.raffle()) {
            this.state.dispensePrize();
        }else {
            System.out.println("别灰心，再抽一次！！！");
        }
    }

    public RaffleActivity(int count) {
        //初始化待抽奖状态
        this.state = getNoRaffleState();
        this.count = count;
    }

    public int getCount() {
        return count--;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
