package com.unit10parcel.exercise;

/**
 * @author: Vincent
 * @description: Write a class named Outer that contains an inner class named Innet.
 * Add a method to Outer that returns an object of type Inner. In main(),
 * create and initialize a reference to an Inner.
 * @date: 2020-10-26 10:22
 **/
public class Outer {
    class Inter{
        Inter(){
            System.out.println("Inner()");
        }
    }
    Outer(){
        System.out.println("Outer()");
    }
    Inter makeInner(){
        return new Inter();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inter i = outer.makeInner();
    }
}
