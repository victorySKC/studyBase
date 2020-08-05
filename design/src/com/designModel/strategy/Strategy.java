package com.designModel.strategy;

/**
 * @program: Design
 * @description: 策略类实现示例
 * @author: sikuncheng
 * @create: 2020-07-30 17:05
 **/
public class Strategy {
    public static void main(String[] args) {
        //普通数据
        String exp = "2+9";
        //策略位置
        I cat = new plus();
        //公共执行窗口
        int result = cat.calculate(exp);
        System.out.println(result);
    }

}
interface I {
    public int calculate(String exp);
}

abstract class A {
    public int[] spit(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);

        return arrayInt;
    }
}

class plus extends A implements I{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = spit(exp,"\\+");

        return arrayInt[0] + arrayInt[1];
    }
}

class multiply extends A implements I{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = spit(exp,"\\-");

        return arrayInt[0] - arrayInt[1];
    }
}