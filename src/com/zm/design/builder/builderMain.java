package com.zm.design.builder;

public class builderMain {
    public static void main(String[] args) {
        System.out.println("测试建造者的一个demo");

        //创建一个普遍房子
        House house = new House("水泥地基","水泥墙","塑料天花板");
        HouseBuilder commonHouse = new CommonHouse(house);
        HouseDiretor houseDiretor = new HouseDiretor(commonHouse);
        House creatHouse = houseDiretor.creatHouse();
        System.out.println(creatHouse.toString());

        new StringBuffer();

    }
}
