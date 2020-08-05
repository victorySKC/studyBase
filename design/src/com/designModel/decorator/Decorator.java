package com.designModel.decorator;

/**
 * @program: Design
 * @description: 装饰模式实现类
 * @author: Vincent Si
 * @create: 2020-07-29 15:29
 **/
/*A类是被装饰类，B类是装饰类，C类可以动态的添加一些功能
 *
 */
public class Decorator {
    public static void main(String[] args) {
        //一个实现装饰接口的类
        IA a = new A();
        //调用实现装饰接口的类
        IA b = new B(a);   //重点
        //执行装饰接口的方法
        b.method();
    }
}
//装饰接口
interface IA {
    public void method();
}

class A implements IA{

    @Override
    public void method() {
        System.out.println("我是装饰类的一个装饰内容：001");
    }
}
//适配器装饰类
class B implements IA { //适配器装饰类
    private IA ia;

   public B(IA ia){
       super();
       this.ia = ia;
   }

    @Override
    public void method() {  //在执行相关任务前、后需要执行的任务
        System.out.println("之前执行");
        ia.method();
        System.out.println("之后执行");
    }
}
