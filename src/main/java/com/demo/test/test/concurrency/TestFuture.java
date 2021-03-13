package com.demo.test.test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestFuture {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future f = exec.submit(new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        System.out.println("fsdf");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        exec.shutdownNow();
//        f.cancel(true);
        System.out.println(f.isCancelled());
    }
}
