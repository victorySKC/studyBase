package com.designModel.template;

/**
 * @program: Design
 * @description: 模板模式
 * @author: sikuncheng
 * @create: 2020-07-31 09:55
 **/
public class Template {
    public static void main(String[] args) {
        //普通数据
        String exp = "2+9";
        //策略位置
        A cat = new Plus();
        //公共执行窗口
        int result = cat.calcuate(exp,"\\+");
        System.out.println(result);
    }
}

abstract class A {
    public final int calcuate(String exp , String opt){
        int array[] = split(exp,opt);
        return calcuate(array[1],array[0]);
    }
    abstract public int calcuate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);

        return arrayInt;
    }
}

class Plus extends A{

    @Override
    public int calcuate(int num1, int num2) {
        return num1+num2;
    }
}