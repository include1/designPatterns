package com.zm.design.facade;

public class Client {
    public static void main(String[] args) {
        System.out.println("外观模式");
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("----------------------------------");
        homeTheaterFacade.close();
    }
}
