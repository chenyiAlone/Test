package org.example.test.other.test.deadLock;


/**
 * 
 * 测试死锁
 * @author 丶尘逸c
 *
 */
public class DeadLockSample implements Runnable {  
    public int flag = 1;  
    static Object o1 = new Object(), o2 = new Object();  
    public void run() {  
                     System.out.println("flag=" + flag);  
        if(flag == 1) {  
            synchronized(o1) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
                synchronized(o2) {  
                    System.out.println("1");      
                }  
            }  
        }  
        if(flag == 0) {  
            synchronized(o2) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
                synchronized(o1) {  
                    System.out.println("0");  
                }  
            }  
        }  
    }     
      
    public static void main(String[] args) {  
    	DeadLockSample td1 = new DeadLockSample();  
    	DeadLockSample td2 = new DeadLockSample();  
        td1.flag = 1;  
        td2.flag = 0;  
        Thread t1 = new Thread(td1);  
        Thread t2 = new Thread(td2);  
        t1.start();  
        t2.start();  
          
    }  
}