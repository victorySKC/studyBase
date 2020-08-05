package com.designModel.factory;

/**
 * @program: Design
 * @description: 工厂测试类
 * @author: sikuncheng
 * @create: 2020-07-25 14:00
 **/
public class FactoryTest {
    //普通工厂
   /* public static void main(String[] args) {
        SenderFactory sf = new SenderFactory();
        Sender sd = sf.FunA("003");
        sd.SenderA();
    }*/

   /** 多哥工厂*/
   public static void main(String[] args) {
       SenderFactory sf = new SenderFactory();
       Sender sd = sf.FunB();
       sd.SenderA();

       Sender sdc = sf.FunC();
       sdc.SenderA();
   }

}
