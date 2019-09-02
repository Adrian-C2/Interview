package com.alogs.functionaldatastructures.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ImmutableQueue<String>();

        queue = queue.enQueue("a");
        queue = queue.enQueue("b");
        queue = queue.enQueue("c");
        queue.enQueue("d");

        queue = queue.deQueue();

        queue = queue.enQueue("e");
    }
}