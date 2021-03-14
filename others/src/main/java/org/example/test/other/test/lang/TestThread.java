package org.example.test.other.test.lang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		
//		mt.start();
		/*mt.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("from " + t +"caught" + e);
				
			}
		});*/
		
//		MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//			
//			@Override
//			public void uncaughtException(Thread t, Throwable e) {
//				// TODO Auto-generated method stub
//				System.out.println("from " + t +"caught" + e);
//				
//			}
//		});
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(mt);
		exec.shutdown();
	}
	

}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("当前线程 "+Thread.currentThread());
		System.out.println("Mythread "+this);
//		Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//			
//			@Override
//			public void uncaughtException(Thread t, Throwable e) {
//				// TODO Auto-generated method stub
//				System.out.println("from " + t +"caught" + e);
//				
//			}
//		});
//		System.out.println(this.getUncaughtExceptionHandler());
		
//		throw new RuntimeException();
//		System.out.println();
	}
	
}