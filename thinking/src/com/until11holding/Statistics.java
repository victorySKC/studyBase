package com.until11holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: Vincent
 * @description: 通过map记录随机数产生的个数
 * @date: 2020-11-10 11:31
 **/

/**
*里面 hasmap里面put与get方法
 *
**/
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 1000 ; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r,freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
