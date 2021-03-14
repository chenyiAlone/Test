package org.example.test.other.test.lang;

import java.util.concurrent.TimeUnit;

public class TestWaitNotif {
	public static void main(String[] args) {
		TestWaitNotif t = new TestWaitNotif();
		t.prod();
		
	}
	public synchronized void prod() {
		while(true) {
			System.out.println("wait();");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void test() {
		new Thread() {
			@Override
			public synchronized void run() {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notify();
			}
		}.start();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new TestWaitNotif().notifyAll();
	}
	
}
