package com.designModel.adapter;

/**
 * @program: Design
 * @description: 适配器类的实现方式-类适配
 * @author: sikuncheng
 * @create: 2020-07-29 11:08
 **/
public class AdapterA {
    public static void main(String[] args) {
        B b = new Adapter();
        b.method01();
        b.method02();
    }
}
/*
 *通过适配器类实现了
 * 让B 接口具有A类的功能
 * */
class Adapter extends A implements B{

    @Override
    public void method02() {
        System.out.println("这是B接口方法");
    }
}
//适配器类
class A{
    //对应的类要方法一致
    public void method01(){
        System.out.println("method01");
    }
}

interface B{
    //对应的类要方法一致
    public void method01();
    public void method02();
}