package com.designModel.singleton;
/*
 *
 * @author sikuncheng
 * @description 普通单例模式，使用锁
 * @name
 * @date 2020/7/25 16:33
 * @param
 * @return
 */
public class SingletonTest {
    //私有静态实例，目的是实现延迟加载
    private static SingletonTest ourInstance = null;

    //构造私有方法，防止被实例化
    private SingletonTest() {
    }

    //静态方法，创建实例
    public static SingletonTest getInstance() {
        if (ourInstance == null){
            synchronized (ourInstance){
                if (ourInstance == null)
                    ourInstance = new SingletonTest();
            }
        }
        return ourInstance;
    }


    //如果该对象被序列号，可以保证序列号前后一致
    public Object readResolve(){
        return ourInstance;
    }
}
