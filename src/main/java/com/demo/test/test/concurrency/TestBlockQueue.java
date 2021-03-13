package com.demo.test.test.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TestBlockQueue {
    public static void main(String[] args) {
        final BlockingQueue<Integer> bqueue = new LinkedBlockingQueue<Integer>();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Thread() {
            @Override
            public void run() {
                try {
                    bqueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("中断了blockingQueue.take()上的等待");
            }
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executor.shutDownNow()!");
        exec.shutdownNow();
    }
}
