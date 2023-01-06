package com.unit01;

import java.util.Calendar;

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
     /*   Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();
        System.out.println(zero);*/

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)-7,0,0,0);
        long tt = calendar.getTime().getTime()/1000;
        System.out.println(tt);



//        System.out.println(offsetDay(new DateTime(), -7));
//        System.out.println(date.toString());
        /*class ATypeName {
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
        a.show();*/

    }
}
