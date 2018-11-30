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
            /* 必须调用FutureTask对象的run()方法完成运行,
             * 才能从FutureTask对象中通过get()获取到Callable对象返回的结果
             */
            f.run();
            System.out.println(f.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
