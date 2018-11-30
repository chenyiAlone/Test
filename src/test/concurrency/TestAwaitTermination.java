package test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestAwaitTermination {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new MyRunnable());
        exec.shutdown();
        try {
            exec.awaitTermination(2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("awaitTermination is false!");
        }
    }

}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("等待完成！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}