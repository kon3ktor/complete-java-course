package gatoStructures;

import java.util.Iterator;

public class ArrayListG <T> implements Iterable<T>{
    private T[] data;
    private int size;

    public ArrayListG(){
        data = (T[]) new Object[10];
        size = 0;
    }

    public ArrayListG(int capacity){
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(T e){
        data[size] = e;
        size++;
    }

    public void add (int index, T e){
        for(int i = size; i > index; i--){
            data[i] = data[i-1];
        }
        data[index] = e;
        size++;
    }

    public String toString(){
        System.out.print("[");
        for(int i = 0; i < size; i++){
            System.out.print(data[i]);
        }
        System.out.println("]");
        return "";
    }

    public T get(int index){
        return data[index];
    }

    public int indexOf(T e){
        for(int i = 0; i < size; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public void remove(T e){
        int index = indexOf(e);
        if(index == -1){
            return;
        }
        for (int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T>{
        private int current = 0;
        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public T next() {
            T e = data[current];
            current++;
            return e;
        }

    }
}
