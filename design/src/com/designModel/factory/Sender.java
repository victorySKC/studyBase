package com.designModel.factory;

/**
 * @program: Design
 * @description: 工厂接口
 * @author: sikuncheng
 * @create: 2020-07-25 13:58
 **/
public interface Sender {
    /**
     * 工厂实现方法
     */
    void SenderA();
}
//一号工厂继承类
class SenderAimpl implements Sender{
    @Override
    public void SenderA() {
        System.out.println("这里是大工厂的001类");
    }
}

//二号工厂继承类
class SenderBimpl implements Sender{
    @Override
    public void SenderA() {
        System.out.println("这里是大工厂的002类");
    }
}