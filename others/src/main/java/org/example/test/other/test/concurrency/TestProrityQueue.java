package org.example.test.other.test.concurrency;

import java.util.concurrent.PriorityBlockingQueue;

public class TestProrityQueue {
    public static void main(String[] args) {
        PriorityBlockingQueue p = new PriorityBlockingQueue(1);
        p.put(1);
        p.put(2);
        
    }
}
