package com.zm.design.memento;

public class Client {
    public static void main(String[] args) {
        System.out.println("备忘录模式");

        //状态1
        Originator originator = new Originator("状态1 攻击力100");
        Memento memento = originator.saveOriginatorToMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento);

        //状态2
        originator = new Originator("状态2 攻击力80");
        caretaker.addMemento(originator.saveOriginatorToMemento());

        //状态3
        originator = new Originator("状态3 攻击力60");
        caretaker.addMemento(originator.saveOriginatorToMemento());


        //恢复指定状态、比如：状态2
        Memento memento1 = caretaker.getMemento(1);
        originator.getStateFromMemento(memento1);

        System.out.println("输出状态2："+originator.getState());
    }
}
