package com.zm.design.composite;
//组织架构抽象类
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public OrganizationComponent(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected void add(){
        throw new UnsupportedOperationException();
    }

    protected void remove(){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
