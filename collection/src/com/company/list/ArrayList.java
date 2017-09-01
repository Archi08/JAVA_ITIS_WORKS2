package com.company.list;

import com.company.list.List;

import java.util.Iterator;

public class ArrayList<T> implements List<T> {

    private int MAX_SIZE = 10;

    private Object elements[];

    private int count;

    private class ArrayListIterator<T> implements Iterator<T>{

        private int currentIndex = 0;
        private Object elements[];
        private int size;



        public ArrayListIterator( Object[] elements, int size) {
            this.currentIndex = 0;
            this.elements = elements;
            this.size = size;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size && elements[currentIndex] != null;
        }

        @Override
        public T next() {
            return (T)elements[currentIndex++];
        }


    }
    public ArrayList() {
        count = 0;
        elements = new Object[MAX_SIZE];
    }

    @Override
    public void add(T element) {
        if (count < MAX_SIZE) {
            this.elements[count] = element;
            count++;
        } else throw new ArrayStoreException();
    }

    @Override
    public void delete(T element) {
        for(int i =0;i<count;i++){
            if(elements[i] == element){
                for(int j = i + 1;j < count; j++){
                    elements[i] = elements[j];
                    i++;
                }
                count--;
                return;
            }
        }
        System.err.println("Нет такого элемента");
    }

    @Override
    public void removeByIndex(int index) {
        if(index<count){
            for(int i=index;i<count-1;i++){
                elements[i]=elements[i+1];
            }
            count--;
        }else{
            System.err.println("Нет такого индекса");
        }

    }

    @Override
    public T get(int index) {
        if(index < count){
            return (T)elements[index];
        }else{
            System.err.println("Неверный индекс");
            return null;
        }
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addToBegin(T element) {
        if(count<MAX_SIZE){
            for(int i =count;i>0;i--){
                 elements[i] = elements[i-1];
            }
            elements[0] = element;
            count++;

        }else throw new ArrayStoreException();
    }

    @Override
    public void print(){
        for(int i = 0; i < count; i++){
            System.out.print("[ ");
            System.out.print(elements[i]);
            System.out.println(" ]");
        }
    }

    @Override
    public void addToIndex(int index, T element) {
            if(count < MAX_SIZE){
                if(count == index){add(element); return;}
                for(int i =count; i >index;i--){
                    elements[i] = elements[i-1];
                }
                elements[index] = element;
                count++;
            }else throw new ArrayStoreException();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {

        return new ArrayListIterator<T>(elements, count);
    }
}
