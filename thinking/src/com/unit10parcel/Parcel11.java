package com.unit10parcel;

/**
 * @author: Vincent
 * @description: 嵌套类示例
 * @date: 2020-10-27 10:11
 **/
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String resadLabel() {
            return label;
        }
        public String readLabel(){return label;}
        //嵌套类 nest 可以报班其他静态元素
        public static void f(){}
        static int x =10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("nest");
    }

}
