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
//        DateTime str = DateUtil.yesterday();
        /**
         * 获得昨天时间 凌晨时间
         */
        Integer integer= -1;
        DateTime dateTime = DateUtil.parse(offsetDay(new DateTime(), integer).toString(), "yyyy-MM-dd");

        /**
         * 将时间切割 由2021-11-04 00:00:00变为 11-04
         */
        String day = dateTime.toString().substring(5,10);
        System.out.println(dateTime);
        System.out.println(day);

    }
}
