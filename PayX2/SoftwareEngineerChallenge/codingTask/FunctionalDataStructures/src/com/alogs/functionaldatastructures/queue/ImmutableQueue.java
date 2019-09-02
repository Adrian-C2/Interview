package com.alogs.functionaldatastructures.queue;

import com.alogs.functionaldatastructures.stack.*;

public class ImmutableQueue<T> implements Queue<T> {
    private final Stack<T> in, out;

    public ImmutableQueue() {
        in = new ImmutableStack<T>();
        out = new ImmutableStack<T>();
    }

    public ImmutableQueue(Stack<T> in, Stack<T> out) {
        if(out.isEmpty()) {
            this.in = new ImmutableStack<T>();
            this.out = in.reverse();
        }
        else {
            this.in = in;
            this.out = out;
        }
    }

    public Queue<T> enQueue(T t) {
        return new ImmutableQueue<T>(in.push(t), out);
    }

    public Queue<T> deQueue() {
        return new ImmutableQueue<T>(in, out.pop());
    }

    public T head() {
        return out.top();
    }

    public boolean isEmpty() {
        return out == null;
    }
}