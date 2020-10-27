package com.unit10parcel;

/**
 * @author: Vincent
 * @description: 多层嵌套示例
 * @date: 2020-10-27 10:45
 **/
class NMA{
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args) {
        NMA nma = new NMA();
        NMA.A mnaa = nma.new A();
        NMA.A.B mnaab = mnaa.new B();
        mnaab.h();

    }
}
