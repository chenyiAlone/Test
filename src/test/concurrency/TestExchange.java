package test.concurrency;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class TestExchange {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Exchanger exchanger = new Exchanger();
        exec.execute(new Runnable() {
 
            @Override
            public void run() {
                try {
                    String data1 = "零食";
                    int money = 100;
                    System.out.println("线程" + Thread.currentThread().getName()
                            + "正在把数据 " + data1 + " 换出去");
                    Thread.sleep((long) Math.random() * 10000);
                    String data2 = (String) exchanger.exchange(money);
                    System.out.println("线程 " + Thread.currentThread().getName()
                            + "换回的数据为 " + data2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
 
            }
        });
 
        exec.execute(new Runnable() {
 
            @Override
            public void run() {
                try {
                    String data1 = "钱";
                    System.out.println("线程" + Thread.currentThread().getName()
                            + "正在把数据 " + data1 + " 交换出去");
                    Thread.sleep((long) (Math.random() * 10000));
                    int data2 = (int) exchanger.exchange(data1);
                    System.out.println("线程 " + Thread.currentThread().getName()
                            + "交换回来的数据是: " + data2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
 
            }
        });
        exec.shutdown();
    }
}