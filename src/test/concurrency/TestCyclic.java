package test.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclic {
    public static void main(String[] args) {

//        test1();
        test2();
    
    }
        public static void test2() {
    
        final CyclicBarrier c = new CyclicBarrier(2);
        new Thread() {
            private final CyclicBarrier cb = c;
            @Override
            public void run() {
                try {
                    cb.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("新建线程等待终止");
            }
        }.start();
        try {
            Thread.sleep(1000);
            System.out.println("cyclicbarrier.wait();");
            c.await();
            System.out.println("main线程等待终止");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    
    }
    public static void test1() {
        CyclicBarrier v = new CyclicBarrier(2,new Runnable() {
            @Override
            public void run() {
                System.out.println("执行开启了new Thread()");
            }
        });
        new Thread() {public void run() {
            try {
                Thread.sleep(3000);
                System.out.println("sleep end!");
                v.await();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }; }.start();
        try {
            v.await();
            System.out.println("await()后面的代码被执行");
        } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
