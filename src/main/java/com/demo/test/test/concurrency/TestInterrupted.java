package com.demo.test.test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestInterrupted {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
			    int i = 0;
			    try {
                    while(!Thread.interrupted()) {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println(i++);
                    }
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    currentThread().interrupt();
                }
        }
		
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					testInterrput();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public void testInterrput() throws InterruptedException{
				while(true) {
					
					Thread.sleep(1000);
					System.out.println("开始");
					System.out.println("结束");
				}
			}
		};
		Thread t3 = new Thread() {
            @Override
            public void run() {
                while(!Thread.interrupted()) {
                    
                    Thread.yield();
                }
            }
        };
		ExecutorService exec = Executors.newCachedThreadPool();
//		exec.execute(t1);
//		exec.execute(t2);
		exec.execute(t3);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exec.shutdownNow();
//		try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//		System.out.println("t1.isInterrupted()" + t1.isInterrupted());
//		System.out.println("main.Thread.interrputed() is :" + Thread.interrupted());
		
	}

}
