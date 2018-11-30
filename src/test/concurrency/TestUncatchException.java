﻿package test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestUncatchException {
    
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.execute(new MyThread());
//        exec.execute(new MyThread());
//        exec.execute(new MyThread());
        exec.execute(new MyThread());
//        Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
//
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
////                e.printStackTrace();
//                System.out.println(t.getName()+"-->"+e.getMessage());
//            }
//        });
        exec.shutdown();
    }
}
class MyThread extends Thread{
    static int i = 0;
    @Override
    public void run() {
//        throw new RuntimeException("MyThread"+i++);
        Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                // TODO Auto-generated method stub
//                System.out.println(e);
                e.printStackTrace();
            }
        });
        int i=1/0;    }
}