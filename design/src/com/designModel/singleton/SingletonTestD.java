package com.designModel.singleton;

import java.util.Vector;

/**
 * @program: Design
 * @description: 影子创建单例模式
 * @author: sikuncheng
 * @create: 2020-07-27 17:05
 **/
public class SingletonTestD {
    public static SingletonTestD instance = null;

    private Vector properties = null;
    public Vector getProperties(){
        return properties;
    }
    //防止实例化
    private SingletonTestD(){}

    //实例
    private static synchronized void synclinit(){
        if (instance == null)
            instance = new SingletonTestD();
    }

    //创建
    public static SingletonTestD getInstance(){
        if (instance == null)
            synclinit();
        return instance;
    }

    public void updateProperties(){
        SingletonTestD sd =new SingletonTestD();
        properties = sd.getProperties();
    }

    public Object readResolve(){
        return getInstance();
    }
}
