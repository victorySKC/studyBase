package com.until11holding.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Vincent
 * @description: TODO
 * @date: 2020-11-06 11:02
 **/
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int j = 0; j < 10; j++) {
            c.add(j);
        }
        for (Integer j:c){
            System.out.println(j + ".");
        }
    }
}
