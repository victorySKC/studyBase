package com.designModel.command;



/**
 * @program: Design
 * @description: 命令模式
 * @author: sikuncheng
 * @create: 2020-07-31 15:19
 * Invoker调用者、 Receiver执行者、
 *
 **/
public class CommandTest {
    public static void main(String[] args) {
        Receiver re = new Receiver();
        Command cmd = new MyCommand(re);
        Invoker inv = new Invoker(cmd);
        inv.action();

    }
}

interface Command{
    public void exe();
}

class MyCommand implements Command{

    private Receiver rec;
    public MyCommand(Receiver rec){
        this.rec = rec;
    }
    @Override
    public void exe() {
        rec.action();
    }
}
class Receiver{
    public void action(){
        System.out.println("收到命令");
    }
}
class Invoker{
    private Command comd;
    public Invoker(Command comd){
        this.comd = comd;
    }
    public void action(){
        comd.exe();
    }
}