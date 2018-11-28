package test.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestRunnableFuture {
    public static void main(String[] args) {
        FutureTask<String> f = new FutureTask<String>(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "call's answer";
            }
        }) ;
        try {
            /* �������FutureTask�����run()�����������,
             * ���ܴ�FutureTask������ͨ��get()��ȡ��Callable���󷵻صĽ��
             */
            f.run();
            System.out.println(f.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
