package com.designModel.facade;

/**
 * @program: Design
 * @description: 外观类的实例
 * @author: sikuncheng
 * @create: 2020-07-29 16:29
 * A类作为外观类，B类C类是任务类。Facade是测试类
 **/
public class Facade {
    public static void main(String[] args) {
        A a = new A();
        a.fun1();
        a.fun2();
    }

}

class A{   //外观类
    private B b;   //观察的类
    private C c;
    public A(){
        b = new B();
        c = new C();
    }
    public void fun1(){
        b.Fun1();
        c.Fun1();
    }
    public void fun2(){
        b.Fun2();
        c.Fun2();
    }
}

class B{
    public void Fun1(){
        System.out.println("B 方法1开始");
    }
    public void Fun2(){
        System.out.println("B 方法2开始");
    }
}

class C{
    public void Fun1(){
        System.out.println("C 方法1开始");
    }
    public void Fun2(){
        System.out.println("C 方法2开始");
    }
}