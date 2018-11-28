package test.concurrency;

import java.util.concurrent.Semaphore;

public class TestSemphore {
    private boolean isFair = false;
    private Semaphore semaphore = new Semaphore(1,isFair);
    
    public void testFair(){
        try {
            semaphore.acquire();
            System.out.println( "正在执行的线程Thread-Name:" + Thread.currentThread().getName());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            semaphore.release();
        }
    }
}
class ThreadA extends Thread{
    private TestSemphore service;
    public ThreadA(TestSemphore service){
        super();
        this.service=service;
    }
    @Override
    public void run() {
        System.out.println( "Thread-Name:" + this.getName() + "启动了！");
        service.testFair();
    }
}


