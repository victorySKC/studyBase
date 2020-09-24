package listStudy.impl;

import listStudy.MyList;

import java.util.Iterator;

/**
 * @author: Vincent
 * @description: 使用数组实现线性表
 * @date: 2020-08-31 11:04
 **/
public class MyArrayList<E> implements MyList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public MyArrayList(){
    }

    public MyArrayList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index >size){
            throw new IndexOutOfBoundsException("Index:" + index + ",size:" + size);
        }
        ensureCapacity();
        for (int i = size -1; i >= index; i --){
            data[i + 1] = data[i];
            data[index] = e;
            size ++;
        }
    }

    public void ensureCapacity(){
        if(size >= data.length){
            E[] neaData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data,0,neaData,0,size);
            data = neaData;
        }
    }

    @Override
    /*clear the list*/
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override/*return true if this list contaions the element */
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i]))
                return  true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)throw
                new IndexOutOfBoundsException("Index :" + index + ", Size:" + size);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i]))
                return i;
        }
        return -1 ;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size -1 ; i < size; i--) {
            if (e.equals(data[i]))
                return i;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int j = index; j < size -1;j ++){
            data[j] = data[index];
        }
        data[size - 1] = null;
        size--;
        return e;
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1)
                result.append(".");
        }
        return result.toString() + "]";
    }
    public void trimToSize(){
        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }


    private class ArrayListIterator implements Iterator<E> {
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current <size;
        }

        @Override
        public E next() {
            return data[current ++];
        }

        @Override
        public void remove() {
            if (current == 0)
                throw new IllegalStateException();
            MyArrayList.this.remove(--current);

        }
    }
}
