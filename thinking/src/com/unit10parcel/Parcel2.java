package com.unit10parcel;

/**
 * @author: Vincent
 * @description: 在外部类运行一个方法，该方法返回一个指向内部类的引用
 * @date: 2020-10-26 10:13
 **/
public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){return label;}
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("asfaseg");
        Parcel2 q = new Parcel2();
        //返回的方法指向内部类的里面引用
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("sdgvsdg");
    }
}
