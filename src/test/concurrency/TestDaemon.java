package test.concurrency;

public class TestDaemon {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Daemon Thread结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("Daemon Thread 中的 finally 语句执行！");
                }
            }
        };
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(2000);
            System.out.println("main Thread结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
