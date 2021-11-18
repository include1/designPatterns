package com.zm.design.facade;

public class HomeTheaterFacade {

    private static Popcorn popcorn = null;
    private static Screen screen = null;
    private static DVDPlayer dvdPlayer = null;

    public HomeTheaterFacade() {
        popcorn = Popcorn.getInstance();
        screen = Screen.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready(){
        popcorn.on();
        screen.on();
        dvdPlayer.on();
    }

    public void close(){
        popcorn.off();
        screen.off();
        dvdPlayer.off();
    }
}
