package com.alogs.functionaldatastructures.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new ImmutableStack<String>();

        stack = stack.push("a");
        stack = stack.push("b");
        stack = stack.pop();
        stack = stack.push("d");
        stack = stack.push("e");
    }
}