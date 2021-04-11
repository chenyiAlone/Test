package org.example.test.javase.juc.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author guitongZhang
 * @date 2021/04/11 15:53
 */
@Slf4j
public class BlockThreadPoolTest {

    /**
     * Use the BlockingQueue#put method of the blocking queue to implement blocking to add the
     * thread pool
     */
    private final RejectedExecutionHandler rejectedExecutionHandler = (Runnable r, ThreadPoolExecutor executor) -> {
        if (!executor.isShutdown()) {
            try {
                executor.getQueue().put(r);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    };

    /**
     * thread factory
     *
     * thread name pref: td-
     */
    private final ThreadFactory threadFactory = new ThreadFactory() {

        private static final String THREAD_NAME_PREFIX = "td-";
        private final AtomicInteger count = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName(THREAD_NAME_PREFIX + count.incrementAndGet());
            return thread;
        }

    };

    /**
     * Use the RejectedHandler to implement blocking thread pools
     *
     * execute logs:
     *
     * 2021-04-11 16:24:46 [main] INFO  o.e.t.j.j.t.BlockThreadPoolTest - add task: 0 success!
     * 2021-04-11 16:24:46 [main] INFO  o.e.t.j.j.t.BlockThreadPoolTest - add task: 1 success!
     * 2021-04-11 16:24:46 [td-0] INFO  o.e.t.j.j.t.BlockThreadPoolTest - exe task: 0 finished!
     * 2021-04-11 16:24:46 [main] INFO  o.e.t.j.j.t.BlockThreadPoolTest - add task: 2 success!
     * 2021-04-11 16:24:47 [td-0] INFO  o.e.t.j.j.t.BlockThreadPoolTest - exe task: 1 finished!
     */
    @Test
    public void BlockRejectedTest() {
        int threadNums = 1;

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(threadNums, threadNums, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1),
            threadFactory, rejectedExecutionHandler);

        for (int i = 0; i < 100; i++) {
            final int tmp = i;
            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("exe task: {} finished!", tmp);
            });
            log.info("add task: {} success!", tmp);
        }
    }

}
