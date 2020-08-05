package com.designModel.memento;

/**
 * @program: Design
 * @description: 备份模式
 * @author: sikuncheng
 * @create: 2020-07-31 16:09
 **/
public class MementoTest {
    public static void main(String[] args) {
        Original original = new Original("abcd");    //创建
        Storage storage = new Storage(original.createMemento()); //备份
        System.out.println("初始化状态为" + original.getValue());
        original.setValue("aaaa"); //修改
        System.out.println("修改后状态"  + original.getValue());
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态" + original.getValue());
    }
}
//原始类
class Original{
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
//备忘录类
class Memento{
    private String value;

    public String getValue() {
        return value;
    }

    public Memento(String value) {
        this.value = value;
    }



    public void setValue(String value) {
        this.value = value;
    }

}
//存储备忘录类
class Storage{
    private Memento value;

    public Memento getMemento() {
        return value;
    }

    public void setMemento(Memento value) {
        this.value = value;
    }
    public Storage(Memento value) {
        this.value = value;
    }
}