package com.zm.design.memento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList;

    public Caretaker(){
        mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
