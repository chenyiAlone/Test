package test.deadLock;


public class Main {  
  
    public static void main(String[] args) {  
        for (int i = 0; i < 3; i++) {  
            Thread thread = new MyThread();  
            thread.start();  
        }  
    }  
}

class Sync {  
  
    public  void test() {
    	synchronized(Sync.class) {
    		System.out.print(Thread.currentThread().getName()+"-->");
	        System.out.println("test¿ªÊ¼..");  
	        try {  
	           Thread.sleep(1000);  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	        System.out.println("test½áÊø..");  
    	}
    }  
}  
  
class MyThread extends Thread {  
  
    public void run() {  
        Sync sync = new Sync();  
        sync.test();  
    }  
}