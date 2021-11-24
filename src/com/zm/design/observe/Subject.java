package com.zm.design.observe;

public interface Subject {
    public void registerObserve(Observe observe);

    public void removeObserve(Observe observe);

    public void notifyObserves();
}
