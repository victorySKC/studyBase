package com.designModel.prototype;

import java.io.*;

/**
 * @program: Design
 * @description: 原型模式
 * @author: sikuncheng
 * @create: 2020-07-27 17:54
 **/
public class PrototypeTestA implements Cloneable{
    //通过clone获得
    /*private static final long versionUid = 1L;

    private String str;*/

    private String st1 = "wangzhe001";

    public PrototypeTestA(String st) {
        st1 = st;
    }


    //通过clone获得浅复制
    public Object clone() throws CloneNotSupportedException {
        PrototypeTestA prototypeTestA = (PrototypeTestA) super.clone();

        return prototypeTestA;
    }

    //  深复制
    public Object deepClone() throws IOException,ClassNotFoundException{
        //将对象写入二进制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流 的对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

}
