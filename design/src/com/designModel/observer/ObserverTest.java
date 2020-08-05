package com.designModel.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @program: Design
 * @description: 观察者模式
 * @author: sikuncheng
 * @create: 2020-07-31 10:48
 **/
public class ObserverTest {
    public static void main(String[] args) {
        subject sub = new mySubject();
        sub.add(new observer1());
        sub.add(new observer2());

        sub.operation();

    }
}
interface observer{
    public void update(String info);
}

class observer1 implements observer{

    @Override
    public void update(String info) {
        System.out.println("observer 001" + info);
    }
}

class observer2 implements observer{
    @Override
    public void update(String info) {
        System.out.println("observer 002" + info);
    }
}

interface subject{
    public void add(observer obs);
    public void del(observer obs);
    public void notifiyObserver(String info);
    public void operation();
}

abstract class AbstSubject implements subject{

    private Vector<observer> vector = new Vector<observer>();
    @Override
    public void add(observer obs) {
        vector.add(obs);
    }

    @Override
    public void del(observer obs) {
        vector.remove(obs);
    }

    @Override
    public void notifiyObserver(String info) {
        Enumeration<observer> ennumo = vector.elements();
        while (ennumo.hasMoreElements()){
            ennumo.nextElement().update(info);
        }
    }
}

class mySubject extends AbstSubject{

    @Override
    public void operation() {
        System.out.println("update self");
        String info = " 更新信息后续";
        notifiyObserver(info);
    }
}