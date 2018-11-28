package test.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 11, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(11));
        if(pool instanceof ThreadPoolExecutor) {
//            pool.setMaximumPoolSize(100);
            pool.setCorePoolSize(81);
        }
//        pool.setCorePoolSize(20);
        System.out.println("pool.getCorePoolSize():"+pool.getCorePoolSize());
    }

}
