package com.designModel.singleton;

/**
 * @program: Design
 * @description: 单例模式,通过工厂模式创建实例
 * @author: sikuncheng
 * @create: 2020-07-27 17:05
 **/
public class SingletonTestB {
    private SingletonTestB(){}

    private static class SingletonFactory{
        private static SingletonTestB instance = new SingletonTestB();
    }

    public static SingletonTestB getInstance(){
        return SingletonFactory.instance;
    }

    public Object readResolve(){
        return getInstance();
    }
}
