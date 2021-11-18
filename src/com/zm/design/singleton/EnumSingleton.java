package com.zm.design.singleton;

enum  EnumSingleton {
    INSTANCE;

    public void ok(){
        System.out.println("ok");
    }
}
class Helloworld{
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}