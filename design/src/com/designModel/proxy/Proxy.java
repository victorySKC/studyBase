package com.designModel.proxy;

/**
 * @program: Design
 * @description: 代理模式
 * @author: Vincent Si
 * @create: 2020-07-29 16:10
 **/
public class Proxy {
    public static void main(String[] args) {
        I i1 = new A();
        I i2 = new B(i1);
        i2.method();
    }
}

interface I{
    public void method();
}
class A implements I{

    @Override
    public void method() {
        System.out.println("这里正在做任务");
    }
}

class B implements I{
    private I i;
    public B(I i){
        super();
        this.i = i;
    }
    @Override
    public void method() {
        before();
        i.method();
        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }


    private void after() {
        System.out.println("after proxy!");
    }
}