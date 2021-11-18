package com.zm.design.builder;

public class HighBuilding extends HouseBuilder {

    public HighBuilding(House house) {
        super.setHouse(house);
    }

    public HighBuilding() {
    }

    public void buildBasic() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给高楼装天花板");
    }
}
