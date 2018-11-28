package test.concurrency;

import java.util.concurrent.TimeUnit;

public class TestSynchronized {
	private static boolean flag = false;
	private static int i = 3;
	public static synchronized void testInterruptSyn() {
		while(!flag) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(flag);
		}
		System.out.println("�ɹ������while()");
	}
	
	public static  void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				testInterruptSyn();
			}
		}.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�޸� i :  3->5 ;");
		i=5;
		System.out.println(i);
		System.out.println("�޸�flag: false->  true;");
//		while(!flag) {
//			
//			flag = true;
//		}
		flag = true;
		System.out.println(flag);
		
	}
	/**
	 * ����synchronized��˭�ǵȼ۵�
	 */
	public static void testSyncEquals() {
		Run r = new Run();
		
		new Thread() {
			public void run() {	
//				r.play();
				r.testSynchronizedthis();
			}
		}.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		r.testSynchronized();
//		r.testSynchronizedThisClass();
//		r.testSynchronizedthis();
		r.testSynchronizednumber();
		
	
	}
	/**
	 * ����synchronized�������Ƕ���
	 */
	public static void testSynchronized() {
//		Run r = new Run();
		new Thread() {
			public void run()
			{new Run().play();}
		}.start();
		
		new Thread() {
			public void run()
			{new Run().play();}
		}.start();
		
		new Thread() {
			public void run()
			{new Run().play();}
		}.start();
		
//		System.out.println("main ��ʼ����r.play()");
//		r.play();
		
		
		
	}
}

 class Run {
	public static  int count = 0;
	private int number;
	private Integer i = new Integer(0) ;
	public Run() {
		count++;
		number = count;
	}
	
	public synchronized void play() {
//		System.out.println("������Runplay���� -->"+ count + " ��δ������");
//		synchronized (this){
			
			try {
				System.out.println(Thread.currentThread()+"������Runsynchronized�� -->"+ number + "   ��ʼplay();");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread()+"������Runsynchronized�� -->"+ number + "   ����play();");
//				System.out.println("Run -->"+ count + "   play();");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			countinueplay();
//		}
	}
	
	public void countinueplay() {
		try {
			System.out.println("����Run -->"+ count + "   countinueplay();");
			Thread.sleep(3000);
			System.out.println("����Run -->"+ count + "   countinueplay();");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testSynchronizedthis() {
		synchronized(this) {
			
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("������Synchronized(this)-->"+i);
			}
		}
	}
	public void testSynchronizednumber() {
		synchronized(i) {
			
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				System.out.println("������Synchronized(this)-->"+number);
				System.out.println("������Synchronized(number)-->"+i);
			}
		}
	}
	
	
	public /*synchronized*/ void test() {
		System.out.println("������Run -->"+ count + "   test");
	}
	public  void testUnSynchronized() {
		System.out.println("������Run -->"+ count + "   testUnSynchronized()!");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������UnSynchronized()-->"+i);
		}
	}
	
	public void testSynchronizedThisClass() {
		synchronized(Run.class) {
			System.out.println("������Run -->"+ count + "   testSynchronizedThisClass()!");
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("������Synchronzied(this.class)->"+i);
			}
		}
	}
	
	public synchronized void testSynchronized() {
		System.out.println("������Run -->"+ count + "   testSynchronized!");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������Synchronized��-->"+i);
		}
	}
}