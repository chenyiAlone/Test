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
                    String data1 = "��ʳ";
                    int money = 100;
                    System.out.println("�߳�" + Thread.currentThread().getName()
                            + "���ڰ����� " + data1 + " ����ȥ");
                    Thread.sleep((long) Math.random() * 10000);
                    String data2 = (String) exchanger.exchange(money);
                    System.out.println("�߳� " + Thread.currentThread().getName()
                            + "���ص�����Ϊ " + data2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
 
            }
        });
 
        exec.execute(new Runnable() {
 
            @Override
            public void run() {
                try {
                    String data1 = "Ǯ";
                    System.out.println("�߳�" + Thread.currentThread().getName()
                            + "���ڰ����� " + data1 + " ������ȥ");
                    Thread.sleep((long) (Math.random() * 10000));
                    int data2 = (int) exchanger.exchange(data1);
                    System.out.println("�߳� " + Thread.currentThread().getName()
                            + "����������������: " + data2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
 
            }
        });
        exec.shutdown();
    }
}