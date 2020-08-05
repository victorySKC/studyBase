package com.designModel.mediator;

/**
 * @program: Design
 * @description: 中介者模式
 * @author: sikuncheng
 * @create: 2020-08-01 10:46
 **/
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.CreateMediator();    //中介者调用创建多有类的方法
        mediator.workAll();           // 执行创哦出来的类
    }
}

interface Mediator{
    public void CreateMediator();
    public void workAll();
}

class MyMediator implements Mediator{

    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public void CreateMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}

abstract class User{
    private Mediator med;
    public User(Mediator med){
        this.med = med;
    }
    public Mediator getMediator(){
        return med;
    }
    public abstract void work();
}

class User1 extends User{

    public User1(Mediator med) {
        super(med);
    }

    @Override
    public void work() {
        System.out.println("user1 exe");
    }
}

class User2 extends User{

    public User2(Mediator med) {
        super(med);
    }

    @Override
    public void work() {
        System.out.println("user2 exe");
    }
}