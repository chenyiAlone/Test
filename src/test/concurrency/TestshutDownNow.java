package test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestshutDownNow {
    
    
    
    
    static Thread t = new Thread() {
        @Override
        public void run() {
//            try {
//                System.out.println(System.in.read());
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
            play();
        }
        public synchronized void play() {
            while(true) {
                Thread.yield();
            }
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
        }
    };
    public static void main(String[] args) {
        
//        testinterrputed();
        testshutDownNow();
    }
    public static void testinterrputed() {
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t.interrupt();
        
    }
    public static  void testshutDownNow() {
        ExecutorService exec = Executors.newCachedThreadPool();
            Future f = exec.submit(t);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
//            System.out.println("start canel()");
//            f.cancel(true);
            exec.shutdownNow();
//        t.start();
//        try {
//          Thread.sleep(500);
//        } catch (InterruptedException e) {
//              // TODO Auto-generated catch block
//              e.printStackTrace();
//        }
//        t.interrupt();
        
    }
}
