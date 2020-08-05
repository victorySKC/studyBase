package com.designModel.adapter;

/**
 * @program: Design
 * @description: 适配器类的实现方式-对象适配器模式
 * @author: sikuncheng
 * @create: 2020-07-29 11:08
 **/
public class AdapterObject {
    public static void main(String[] args) {
        A2 a2 = new A2();           //具体执行拓展方法类
        B2 b = new Adapter2(a2);    //调用拓展的适配类
        b.method01();
        b.method02();
    }
}

/*
 *通过适配器类实现了
 * 让B 接口具有A类的功能
 * */
class Adapter2  implements B2{

    private A2 a2;
    public Adapter2(A2 a2){
        super();;
        this.a2 = a2;
    }
    //在适配器类中调用实例对象，通过实例对象的方法执行具体的method01的方法
    @Override
    public void method01() {
        a2.method01();
    }

    @Override
    public void method02() {
        System.out.println("这是B接口方法002");
    }
}

//适配器类
class A2{
    //对应的类要方法一致
    public void method01(){
        System.out.println("method01");
    }
}

interface B2{
    //对应的类要方法一致
    public void method01();
    public void method02();
}