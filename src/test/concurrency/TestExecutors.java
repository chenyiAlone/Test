package test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutors {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("fdsfsd");
            }
            @Override
            public String toString() {
               return "���߳�1";
            }
            
        });
//        exec.execute(new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("fdsfsd");
//            }
//            @Override
//            public String toString() {
//               return "���߳�2";
//            }
//            
//        });
        try {
            exec.shutdown();
            System.out.println("��ʼawait()");
            boolean b = exec.awaitTermination(7, TimeUnit.SECONDS);
            System.out.println("����await()");
//            System.out.println(exec.shutdownNow());
            System.out.println("awaitTerination():\t" + b);
            
//            System.out.println("isShutdown():\t" + exec.isShutdown());
        } catch (InterruptedException e) {
            e.printStackTrace();
            exec.shutdown();
        }
    }
}
