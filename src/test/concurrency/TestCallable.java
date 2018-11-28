package test.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestCallable {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<String> f ;
//		try {
//			for(int i=0;i<10;i++) {
//			f = exec.submit(new MyCallable());
//				
//				System.out.println(f.get());
//			}
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			exec.shutdown();
//		}
		MyCallable mc = new MyCallable();
		FutureTask ft = new FutureTask(mc);
		try {
//		    ft.run();
		    exec.execute(ft);
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
	}

}
class MyCallable implements Callable<String>{
	private static int count =0;
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return Integer.toString(count++);
	}
	
}
