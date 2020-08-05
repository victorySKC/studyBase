package com.designModel.singleton;

/**
 * @program: Design
 * @description: 通过创建和实例分开
 * @author: sikuncheng
 * @create: 2020-07-27 17:05
 **/
public class SingletonTestC {
    public static SingletonTestC instance = null;

    private SingletonTestC(){}

    //实例
    private static synchronized void synclinit(){
        if (instance == null)
            instance = new SingletonTestC();
    }

    //创建
    public static SingletonTestC getInstance(){
        if (instance == null)
            synclinit();
        return instance;
    }


    public Object readResolve(){
        return getInstance();
    }
}
