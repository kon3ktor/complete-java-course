package gatoStructures;

import java.util.Iterator;

public class ArrayListG <T> implements Iterable<T>{
    private T[] data;
    private int size;

    public ArrayListG(){
        data = (T[]) new Object[5];
        size = 0;
    }

    public ArrayListG(int capacity){
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        data = (T[]) new Object[5];
        size = 0;
    }

    public void shrink(){
        T[] newData = (T[]) new Object[size];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public void expandCapacity(){
        T[] newData = (T[]) new Object[data.length*2];
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public void add(T e){
        if (size == data.length){
            expandCapacity();
        }
        data[size] = e;
        size++;
    }

    public void add (int index, T e){
        if (size == data.length){
            expandCapacity();
        }
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
        if (capacity() > 5 && size < capacity()/4){
            shrink();
        }
        int index = indexOf(e);
        if(index == -1){
            return;
        }
        for (int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        size--;
    }

    public void remove(int index){
        if (capacity() > 5 && size < capacity()/4){
            shrink();
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

    //3 LC exercises below
    public void spofArray(ArrayListG data){
        int sum = 0;
        int product = 1;
        for (int i = 0; i < data.size(); i++){
            sum += (int) data.get(i);
            product *= (int) data.get(i);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    public void printPairs(ArrayListG data){
        for (int i = 0; i < data.size(); i++){
            for (int j = 0; j < data.size(); j++){
                System.out.println("(" + data.get(i) + "," + data.get(j) + ")");
            }
        }
    }

    public void reverseArray(ArrayListG<T> data){
        ArrayListG<T> newData = data;
        for (int i = size-1; i >= 0; i--){
            data.add(newData.get(i));
        }
    }

}
