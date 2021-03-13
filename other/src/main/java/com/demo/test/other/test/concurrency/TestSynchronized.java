package com.demo.test.other.test.concurrency;

/**
 * 
 * ClassName: TestSynchronized
 * @author chenyiAlone  
 * Create Time: 2019/01/16 11:40:35
 * Description: 
 * 总结:
 *  1. 在另一个线程中修改当前线程的属性时，尽管可以可以进行修改，但是这个更改对于当前线程来说是不可见的，
 *     必须变量属性实现同步才能保证其可见性
 *  2. synchronized关键字和synchronized(this)使用的是同一个锁，而.class并不会影响
 *  3. synchronized关键字的主要作用就是锁定对象，也就是当前对象，当获取到了sychronized这个锁以后，也就是
 *     一个线程持有了当前对象this的锁，这个锁被占有的过程中，其他线程想使用这个对象上的方法，必须等待锁释放
 *  
 */
public class TestSynchronized {
	private static int i = 3;
	private static volatile boolean flag = false;
	
	public static void testInterruptSyn() {
		while(!flag) { /* 测试能否被中断 */ }
		System.out.println("成功打断了while()");
	}
	
	public static void main(String[] args) {
//	    testVisibility(); // 测试线程共享对象的可见性
	    testSyncEquals(); // 测试synchronized(...)之间的等价关系
	}
	public static synchronized void modifyFlag() {
	    flag = !flag;
	}
	
	/**
	 * 新建线程修改当前线程的while循环的判断标志，测试能否将这个循环打断
	 * 1. 使用volatile关键字,保证线程共享变量的可见性
	 */
	public static void testVisibility() {
	    new Thread(){
            @Override
            public void run() {
                testInterruptSyn();
            }
        }.start();
        // 延迟100ms后修改flag
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("修改 i :  3->5 ;");
        i = 5;
        System.out.println(i);
        
        System.out.println("修改flag: false->  true;");
        modifyFlag();
        System.out.println(flag);
        
	}
	
	
	/**
	 * 测试synchronized和谁是等价的
	 * 结论:
	 * 1. synchronized和synchronized(this)是等价的
	 */
	public static void testSyncEquals() {
		Run r = new Run();
		
		new Thread() {
			public void run() {	
//				r.play();
				r.testSynchronizedthis();
//        		r.testSynchronizednumber();
//        		r.testSynchronizedThisClass();
			}
		}.start();
		
//		r.testSynchronized();
		r.testSynchronized2();
//		r.testSynchronizedthis();
//		r.testSynchronizedThisClass();
//		r.testSynchronizednumber();
		
	
	}
	/**
	 * 测试synchronized锁定的是对象
	 */
	public static void testSynchronized() {
//		Run r = new Run();
		new Thread() {
			public void run() {
			    new Run().play();
			}
		}.start();
		
		new Thread() {
			public void run() {
			    new Run().play();
		    }
		}.start();
		
		new Thread() {
			public void run() {
			    new Run().play();
		    }
		}.start();
		
//		System.out.println("main 开始调用r.play()");
//		r.play();
	}
}

class Run {
   public static  int count = 0;
   private int number;
   private Integer num = new Integer(0) ;
   public Run() {
       count++;
       number = count;
   }

   public synchronized void play() {
//		System.out.println("进入了Runplay方法 -->"+ count + " 但未进入域");
//		synchronized (this){

           try {
               System.out.println(Thread.currentThread()+"进入了Runsynchronized域 -->"+ number + "   开始play();");
               Thread.sleep(3000);
               System.out.println(Thread.currentThread()+"进入了Runsynchronized域 -->"+ number + "   结束play();");
//				System.out.println("Run -->"+ count + "   play();");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
//			countinueplay();
//		}
   }

   public void countinueplay() {
       try {
           System.out.println("进入Run -->"+ count + "   countinueplay();");
           Thread.sleep(3000);
           System.out.println("结束Run -->"+ count + "   countinueplay();");
       } catch (InterruptedException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }
   public void testSynchronizedthis() {
       synchronized(this) {
           for (int i = 0; i < 10; i++) {
               Thread.yield();
               System.out.println(Thread.currentThread().getName() + "调用了Synchronized(this)-->"+i);
           }
       }
   }
   public void testSynchronizednumber() {
       synchronized(num) {
           for (int i = 0; i < 10; i++) {
//				System.out.println("调用了Synchronized(this)-->"+number);
               Thread.yield();
               System.out.println(Thread.currentThread().getName() + "调用了Synchronized(number)-->"+i);
           }
       }
   }


   public /*synchronized*/ void test() {
       System.out.println("调用了Run -->"+ count + "com/demo/test/test");
   }
   public  void testUnSynchronized() {
       System.out.println(Thread.currentThread().getName() + "调用了Run -->"+ count + "   testUnSynchronized()!");
       for(int i=0;i<10;i++) {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("调用了UnSynchronized()-->"+i);
       }
   }

   public void testSynchronizedThisClass() {
       synchronized(this.getClass()) {
//			System.out.println("调用了Run -->"+ count + "   testSynchronizedThisClass()!");
           for (int i = 0; i < 10; i++) {
               Thread.yield();
               System.out.println(Thread.currentThread().getName() + "调用了Synchronzied(this.class)->"+i);
           }
       }
   }

   public synchronized void testSynchronized() {
//		System.out.println("调用了Run -->"+ count + "   testSynchronized!");
       for (int i = 0; i < 10; i++) {
           System.out.println(Thread.currentThread().getName() + "调用了Synchronized块-->"+i);
       }
   }
   public synchronized void testSynchronized2() {
//      System.out.println("调用了Run -->"+ count + "   testSynchronized!");
       for (int i = 0; i < 10; i++) {
           System.out.println(Thread.currentThread().getName() + "调用了Synchronized块-->"+i);
       }
   }
}