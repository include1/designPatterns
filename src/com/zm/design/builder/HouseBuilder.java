package com.zm.design.builder;

public abstract class HouseBuilder {
    private House house;

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public House buildHouse(){
        return house;
    }
}
