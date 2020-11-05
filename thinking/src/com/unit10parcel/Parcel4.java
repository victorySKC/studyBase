package com.unit10parcel;

/**
 * @author: Vincent
 * @description: 内部类与向上转型
 * @date: 2020-11-04 11:32
 **/
public class Parcel4 {
    private class PContents implements Contents{

        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String resadLabel() {

            return label;
        }
    }
}
