package com.designModel.factory;

/**
 * @program: Design
 * @description: 抽象工厂测试类
 * @author: sikuncheng
 * @create: 2020-07-25 15:12
 **/
public class FactoryTest02 {
    public static void main(String[] args) {
        //实例化一个第二个接口的实现类
		SenderB seb = new SenderBimpl01();
    //    SenderB seb = new SenderBimpl02();
        //通过第二个接口的实现类获取第一个接口的实现类
        Sender se = seb.sendSender();
        //执行第一个接口统一方法
        se.SenderA();
    }
}

//工厂接口实现类1
class SenderBimpl01 implements SenderB {

    @Override
    public Sender sendSender() {
        return new Senderimpl01();
    }
}

//工厂接口实现类2
class SenderBimpl02 implements SenderB {

    @Override
    public Sender sendSender() {
        return new Senderimpl02();
    }
}

//一号工厂继承类
class Senderimpl01 implements Sender {
    @Override
    public void SenderA() {
        System.out.println("这里是大工厂的001类");
    }
}

//二号工厂继承类
class Senderimpl02 implements Sender {
    @Override
    public void SenderA() {
        System.out.println("这里是大工厂的002类");
    }

}
