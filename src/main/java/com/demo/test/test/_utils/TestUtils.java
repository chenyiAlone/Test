package com.demo.test.test._utils;

public class TestUtils {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = test1;
		test1 = null;
		System.out.println(test1 instanceof Test);
		System.out.println(test2 instanceof Test);
	}

}
class Test{
	
}
