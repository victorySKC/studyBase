package com.designModel.interator;

/**
 * @program: Design
 * @description: 迭代器
 * @author: sikuncheng
 * @create: 2020-07-31 11:31
 **/
public class InteratorTest {

    public static void main(String[] args) {
        Collection con  =new myCollection();
        Iterator1 it = con.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }

    }
}
interface Collection{
    public myIterator iterator();
    public Object get(int i);  //获取元素
    public int size();         //获取集合大小
}
interface Iterator1{
    public Object previous();  //前移
    public Object next();      //后移
    public boolean hasNext();
    public Object first();     //获得第一个元素

}
class myCollection implements Collection{
    public String string[] = {"A","B","C"};

    @Override
    public myIterator iterator() {
        return new myIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}

class myIterator implements Iterator1{
    private Collection collection;
    private int pos = -1;

    public myIterator(myCollection myCollection){
        this.collection = myCollection;
    }
    @Override
    public Object previous() {
        if (pos > 0)
            pos--;
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size()-1)
            pos++;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() -1 )
            return true;
        else
         return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(-1);
    }
}