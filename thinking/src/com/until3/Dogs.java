package com.until3;

/**
 * @author: Vincent
 * @description: 3.7关系练习
 * @date: 2020-09-23 14:50
 **/
public class Dogs {
    String name;
    String says;
    void setName(String n) {
        name = n;
    }
    void setSays(String s) {
        says = s;
    }
    void showName() {
        System.out.println(name);
    }
    void speak() {
        System.out.println(says);
    }

    public static void main(String[] args) {
        Dogs spot = new Dogs();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dogs scruffy = new Dogs();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();

    }
}
