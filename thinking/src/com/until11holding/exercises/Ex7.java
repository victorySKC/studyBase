package com.until11holding.exercises;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: Vincent
 * @description: Modify Exercise 1 so it uses an Iterator to move through the List while
 * calling hop().
 * @date: 2020-11-09 16:31
 **/
class Gerbil1 {
    private int gerbilNumber;
    public Gerbil1(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}
public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Gerbil1> gerbils = new ArrayList<Gerbil1>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Gerbil1(i));
        Iterator<Gerbil1> it = gerbils.iterator();
        while(it.hasNext())
            it.next().hop();
    }
}
