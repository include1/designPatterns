package com.zm.design.builder;

public class HouseDiretor {

    private HouseBuilder houseBuilder;

    public HouseDiretor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //写一个创建房子的步骤
    public House creatHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }

}
