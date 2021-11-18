package com.zm.design.prototype;

public class Sheep implements Cloneable {

    private String name;

    private Integer age;

    private Sheep friend; //浅拷贝，不会复制该对象

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep() {
    }

    public Sheep(String name, Integer age, Sheep friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
