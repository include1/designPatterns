package com.zm.design.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {
    //保存同事对象
    HashMap<String, Colleague> colleagueHashMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
    }

    @Override
    public void registerColleague(String name, Colleague colleague) {
        colleagueHashMap.put(name, colleague);
    }

    @Override
    public void getMessage(int state, String colleagueName) {
        if(colleagueHashMap.get(colleagueName) instanceof  Alarm){
            if(state == 1){
                ((TV)colleagueHashMap.get("TV")).on();
            }else if(state == 0){
                ((TV)colleagueHashMap.get("TV")).off();
            }
        }
    }

    @Override
    public void sendMessage() {

    }


}
