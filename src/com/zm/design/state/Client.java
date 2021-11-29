package com.zm.design.state;

public class Client {
    public static void main(String[] args) {
        System.out.println("状态模式");

        RaffleActivity activity = new RaffleActivity(2);
        for (int i = 0; i < 30; i++) {
            System.out.println("-----------------------第" + (i + 1) + "次抽奖----------------------");
            activity.deraseMoney();
            activity.dispensePrize();
        }
    }
}
