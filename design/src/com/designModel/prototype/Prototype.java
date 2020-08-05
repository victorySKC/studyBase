package com.designModel.prototype;

/**
 * @program: Design
 * @description: 圆形模式简单实现
 * @author: sikuncheng
 * @create: 2020-07-29 10:26
 **/
public class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException{
        Prototype pro = (Prototype)super.clone();
        return pro;
    }
}
/*
 *  最简单的圆形模式的实现类，就是实现Cloneable接口， Cloneable里面是空的，仅仅是实现一个标记实现方法属性的作用。执行super.clone();
 */
