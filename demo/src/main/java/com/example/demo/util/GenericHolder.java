package com.example.demo.util;

public class GenericHolder<T> {
    private T object;

    public GenericHolder(T object) { this.object = object; }
    public T getObject() { return object; }
    public void setObject(T object) { this.object = object; }
}
