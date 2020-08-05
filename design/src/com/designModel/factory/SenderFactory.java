package com.designModel.factory;

/**
 * @program: Design
 * @description: 工厂类实现类
 * @author: sikuncheng
 * @create: 2020-07-25 14:10
 **/
public class SenderFactory {
    //普通工厂方法
    public Sender FunA(String type){
        if(type.equals("001")){
            return new SenderAimpl();
        }else if(type.equals("002")){
            return new SenderBimpl();
        }else{
            System.out.println("传入类型有问题！");
            return null;
        }
    }

    //多个工厂模式
    public Sender FunB(){
        return new SenderAimpl();
    }

    //多个工厂模式
    public Sender FunC(){
        return new SenderBimpl();
    }


    //静态工厂模式
    public static Sender FunD() {
        return new SenderAimpl();
    }

    //静态工厂模式
    public static Sender FunF() {
        return new SenderBimpl();
    }
}
