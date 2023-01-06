package com.example.vincent;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import static cn.hutool.core.date.DateUtil.offsetDay;

/**
 * @author SiVincent
 * @description 获得零时测试类
 * @date 2021/11/2
 */
public class Date {
    public static void main(String[] args) {
        DateTime str = DateUtil.yesterday();
        /**
         * 获得昨天时间 凌晨时间
         */
        Integer integer= 0;
        DateTime dateTime = DateUtil.parse(offsetDay(new DateTime(), integer).toString(), "yyyy-MM-dd");
        DateTime hour = DateUtil.offsetHour(dateTime , 2);
        /**
         * 将时间切割 由2021-11-04 00:00:00变为 11-04
         */
        //获得当前小时数，并强转为int
        DateTime now = DateTime.now();
        int nowHour = Integer.parseInt(now.toString().substring(11,13));

//        DateTime time = dateTime
//        System.out.println(dateTime);
        System.out.println(hour);
        System.out.println(nowHour);
//        DateTime now = DateTime.now();
//        now.hour()
//        System.out.println(now);


       /* for (int i = 0; i < 13; i=i+2) {
            System.out.println(i);
        }
*/
        if ((0 & 1) == 0){
            System.out.println("keyi panduan 0");
        }

    }
}
