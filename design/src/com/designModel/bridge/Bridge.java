package com.designModel.bridge;

/**
 * @program: Design
 * @description: 桥接类
 * @author: sikuncheng
 * @create: 2020-07-30 14:29
 **/
public class Bridge {
    public static void main(String[] args) {
        BridgeI bi = new MyBridge();
        I i1 = new A();
        bi.setI(i1);
        bi.method();

        I i2 = new B();
        bi.setI(i2);
        bi.method();
    }
}

interface I {
    public void method();
}

class A implements I{

    @Override
    public void method() {
        System.out.println("第一个实现接口类的方法");
    }
}

class B implements I{

    @Override
    public void method() {
        System.out.println("第二个实现接口的方法");
    }
}

abstract class BridgeI{
    private I i;
    public void method(){
     i.method();
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }
}

class MyBridge extends BridgeI{
    public void method(){
        getI().method();
    }
}