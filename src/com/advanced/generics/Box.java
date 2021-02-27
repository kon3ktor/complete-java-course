package com.advanced.generics;

public class Box<T> {

    private T typeData;

    public void setTypeData(T typeData) {
        this.typeData = typeData;
    }

    public T getTypeData() {
        return typeData;
    }

    @Override
    public String toString() {
        return "Box{" +
                "typeData=" + typeData +
                '}';
    }
}
