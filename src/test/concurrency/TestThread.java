package test.concurrency;

public class TestThread {
    private static /*volatile*/ boolean flag = false;
    public static synchronized void modify() {
        flag = true;
    }
    public static synchronized boolean flag() {
        return flag;
    }
    
	public static void main(String[] args) {
	    new Thread() {
	        public void run() {
	                while(!flag) {
	                        System.out.println("jinrudengdai");
	                
	            }
	            System.out.println("结束循环");
	        } 
        }.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        flag = true;
        modify();
        System.out.println("xiugai");
        System.out.println(flag);
//		Thread t = new Thread("shanianian");
//		System.out.println(t.getName());
	}
}
