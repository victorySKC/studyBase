package com.designModel.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design
 * @description: 建造者模式测试类
 * @author: sikuncheng
 * @create: 2020-07-25 15:35
 **/
public class BuilderTest {
    private List<String> list = new ArrayList<String>();

    public void BuilderA(int c){
        for (int i = 0; i < c; i++) {
            list.add(new String("asd"));
        }
    }

    public void BuilderB(int c){
        for (int i = 0; i < c; i++) {
            list.add(new String("asdx"));
        }
    }
    public void print(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        BuilderTest builderTest = new BuilderTest();
        builderTest.BuilderA(3);
        builderTest.print();

    }
}
