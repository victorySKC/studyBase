package com.designModel.adapter;

/**
 * @program: Design
 * @description: 适配器类的实现方式-接口适配器模式
 * 接口有多个方法，通过抽象类的方式来实现接口在调用，继承抽象的方式改写部分接口
 * @author: sikuncheng
 * @create: 2020-07-29 11:08
 **/
public class AdapterIn {
    public static void main(String[] args) {
        A3 a001 = new C1();
        A3 a002 = new C2();

        a001.method01();
        a001.method02();
        a002.method01();
        a002.method02();
    }
}
/*
 *   父级接口
 */
interface A3{
    //对应的类要方法一致
    public void method01();
    public void method02();
}
// 抽象类实现接口方法
abstract class Adapter3 implements A3{
    @Override
    public void method01() {
        System.out.println("hello 01");
    }

    @Override
    public void method02() {
        System.out.println("hello 02");
    }
}
class C2 extends Adapter3 {
    @Override
    public void method02() {
        System.out.println("C2重写method02");
    }
}

class C1 extends Adapter3 {
    @Override
    public void method01() {
        System.out.println("C1重写method01");
    }
}