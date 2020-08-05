package com.designModel.visitor;

/**
 * @program: Design
 * @description: 访问者模式
 * @author: sikuncheng
 * @create: 2020-08-01 10:29
 **/
public class VisitorTest {
    public static void main(String[] args) {
        Visitor visitor = new MyVistor();      //访问者的实现类
        Subject subject = new MySubject();     //主题
        subject.accept(visitor);
    }
}

interface Visitor{
    public void visit(Subject subject);
}

interface Subject{
    public void accept(Visitor visitor);
    public String getSubjrct();
}

class MyVistor implements Visitor{

    @Override
    public void visit(Subject subject) {
        System.out.println("visitor subject is" + subject.getSubjrct());
    }
}

class MySubject implements Subject{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubjrct() {
        return "001 bast";
    }
}
