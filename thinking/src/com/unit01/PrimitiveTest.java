package com.unit01;

/**
 * @author: Vincent
 * @description: 初始化测试
 * @date: 2020-10-22 16:42
 **/
public class PrimitiveTest {
    /*static int i;
    static char c;
    static boolean b;
    public static void main(String[] args) {
        System.out.println("int = " + i);
        System.out.println("char = " + c);
        System.out.println("boolean = " + b);
    }*/
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}
