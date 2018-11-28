package test.deadLock;


public class Test {  
  
    public static void main(String[] args) {  
       MySync m = new MySync();
       Thread t1 = new Thread(m,"�߳�һ");
       Thread t2 = new Thread(m,"�̶߳�");
       Thread t3 = new Thread(m,"�߳���");
       t1.start();
       t2.start();
       t3.start();
    }  
}

class MySync implements Runnable{  
	
	@Override
	public void run() {
		test1();
//		test2();
//		test3();
	}
	
	//
	public synchronized void test3() {
	
		 System.out.print(Thread.currentThread().getName()+"-->");
		 System.out.println("test��ʼ..");  
		 try {  
			  Thread.sleep(1000);  
		 } catch (InterruptedException e) {  
			  e.printStackTrace();  
		 }  
		 System.out.print(Thread.currentThread().getName()+"-->");
		 System.out.println("test����..");  
	}  
	
	//��.class
	public  void test2() {
		  synchronized(MySync.class) {
			  System.out.print(Thread.currentThread().getName()+"-->");
			  System.out.println("test��ʼ..");  
			  try {  
				  Thread.sleep(1000);  
			  } catch (InterruptedException e) {  
				  e.printStackTrace();  
			  }  
			  System.out.print(Thread.currentThread().getName()+"-->");
			  System.out.println("test����..");  
		  }
	 }  
	
	//��this
	public  void test1() {
		synchronized(this) {
			System.out.print(Thread.currentThread().getName()+"-->");
	        System.out.println("test��ʼ..");  
	        try {  
	           Thread.sleep(1000);  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	        System.out.print(Thread.currentThread().getName()+"-->");
	        System.out.println("test����..");  
		}
	}  
}  
  