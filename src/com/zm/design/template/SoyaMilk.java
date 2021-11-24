package com.zm.design.template;

public abstract class SoyaMilk {

    final void make() {
        select();
        if (judge()) {
            addCondiments();
        }
        soak();
        beat();
    }

    public void select() {
        System.out.println("第一步 选择新鲜黄豆");
    }

    public abstract void addCondiments();

    public void soak() {
        System.out.println("第三步 黄豆和配料搅拌");
    }

    public void beat() {
        System.out.println("第四步 黄豆和配料在豆浆机打碎");
    }

    public boolean judge() {
        return true;
    }
}
