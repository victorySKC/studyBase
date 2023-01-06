package com.example.vincent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SiVincent
 * @description
 * @date 2021/11/11
 */
public class testMap {
    public static void main(String[] args) {
        Map map1 = new HashMap<>();

        Map map2 = new HashMap<>();

        Map mapA = new HashMap<>();

        map1.put("a", "b");

        map1.put("b", "d");

        map1.put(2, "c");

        map1.put("e", "r");

        map2.put("a", "b");

        map2.put(1, "c");

        mapA.put("map1",map1);
        mapA.put("map2",map2);
        System.out.println(mapA.toString());
    }
}
