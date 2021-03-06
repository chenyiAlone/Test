package org.example.test.other.test.concurrency;

import java.util.concurrent.Semaphore;

public class TestSemphore {
    private boolean isFair = false;
    private Semaphore semaphore = new Semaphore(1,isFair);
    
    public void testFair(){
        try {
            semaphore.acquire();
            System.out.println( "姝ｅ湪镓ц镄勭嚎绋婽hread-Name:" + Thread.currentThread().getName());
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
        System.out.println( "Thread-Name:" + this.getName() + "鍚姩浜嗭紒");
        service.testFair();
    }
}


