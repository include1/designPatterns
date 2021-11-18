package com.zm.design.builder;

public class CommonHouse extends HouseBuilder {

    public CommonHouse(House house) {
        super.setHouse(house);
    }

    public CommonHouse() {
    }

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给普通房子装天花板");
    }
}
