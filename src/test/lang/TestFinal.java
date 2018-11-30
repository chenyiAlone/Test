package test.lang;

import java.util.ArrayList;
import java.util.List;

public class TestFinal {
    public static final Integer count = null;
	public final int j;
	TestFinal(int x){
		j=x;
	}
	private void init() {}
	public static void main(String[] args) {
	    System.out.println(testFinallyAndReturn());
//	    finallySleep();
//	    testFinalEvent("测试");
//	    testFinalEvent(new String("测试2"));
//	    System.out.println("方法结束");
	}
	public static void testFinalEvent(final String str) {
	    System.out.println(str);
	}
	public static void finallySleep() {
	    try {
	        System.out.println("try");
	    } finally {
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
	public static int testFinallyAndReturn() {
	    try {
	        return 1;
	    } finally {
	        System.out.println(0);
	    }
	}
	
	public static void test1() {
//	    count = 4;
	    final List list = new ArrayList<>();
	    list.add(7);
	    list.add(4);
	    list.add(5);
	    list.add(6);
	    list.add(2);
//		new TestFinal(3);
		System.out.println("final List = " + list);
		final int i = 0;
//		i =9;
	}
}