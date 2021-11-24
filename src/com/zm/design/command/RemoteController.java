package com.zm.design.command;

public class RemoteController {

    //开 命令数组
    Command onCommand[];

    //关 命令数组
    Command offCommand[];

    //重置命令
    Command unCommand;

    public RemoteController(){
        onCommand = new Command[5];
        offCommand = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    //添加指定命令
    public void setControllerCommand(int no,Command onCommand,Command offCommand){
        this.onCommand[no] = onCommand;
        this.offCommand[no] = offCommand;
    }

    //按下开按钮
    public void pushOnButton(int no){
        this.onCommand[no].execute();
        unCommand = this.onCommand[no];
    }
    //按下关按钮
    public void pushOffButton(int no){
        this.offCommand[no].execute();
        unCommand = this.offCommand[no];
    }
    //重置按钮
    public void reset(){
        System.out.println("重置操作");
        unCommand.undo();
    }
}
