package test.anonymityinner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutorSerivce {
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
            }});
        try {
//            exec.shutdown();
           System.out.println(exec.awaitTermination(2, TimeUnit.SECONDS)); 
           exec.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }});
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    

}
