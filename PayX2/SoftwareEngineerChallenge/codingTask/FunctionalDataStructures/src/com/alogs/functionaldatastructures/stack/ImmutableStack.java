package com.alogs.functionaldatastructures.stack;

public class ImmutableStack<T> implements Stack<T> {
    private final T data;
    private final ImmutableStack<T> tail;

    public ImmutableStack() {
        this.data = null;
        this.tail = null;
    }

    public ImmutableStack(T data, ImmutableStack<T> tail) {
        this.data = data;
        this.tail = tail;
    }

    public Stack<T> push(T data) {
        return new ImmutableStack<T>(data, this);
    }

    public Stack<T> pop() {
        return tail;
    }

    public T top() {
        return data;
    }

    public boolean isEmpty(){
        return tail == null;
    }

    public static <T> Stack<T> empty() {
        return new ImmutableStack();
    }

    public Stack<T> reverse() {
        Stack<T> in = this, out = empty();

        while (!in.isEmpty()) {
            out = out.push(in.top());
            in = in.pop();
        }

        return out;
    }
}