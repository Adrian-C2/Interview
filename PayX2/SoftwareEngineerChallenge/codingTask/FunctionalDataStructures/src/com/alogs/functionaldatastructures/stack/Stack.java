package com.alogs.functionaldatastructures.stack;

public interface Stack<T> {
    public Stack<T> push(T data);
    public Stack<T> pop();
    public T top();
    public boolean isEmpty();
    public Stack<T> reverse();
}
