package test.concurrency;

public class TestJoin {
    public static void main(String[] args) {
        
    }
    
    public static void test(){
        Runnable r = new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("new Thread()");
            }
            
        };
        Thread t = new Thread(r);
        t.start();
        try {
            t.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main()");
    }

}
