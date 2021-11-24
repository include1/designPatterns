package com.zm.design.observe;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {

    private float tempureture;
    private float pressure;
    private float humidity;
    private List<Observe> observeList;

    public WheatherData() {
        this.observeList = new ArrayList<>();
    }

    public float getTempureture() {
        return tempureture;
    }

    public void setTempureture(float tempureture) {
        this.tempureture = tempureture;
    }

    public float getPressure() {
        return pressure;
    }

    public void setWheatherData(float tempureture, float pressure, float humidity) {
        this.tempureture = tempureture;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserves();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public void registerObserve(Observe observe) {
        this.observeList.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        this.observeList.remove(observe);
    }

    @Override
    public void notifyObserves() {
        for (int i = 0; i < observeList.size(); i++) {
            observeList.get(i).update(this.tempureture, this.pressure, this.humidity);
        }
    }
}
