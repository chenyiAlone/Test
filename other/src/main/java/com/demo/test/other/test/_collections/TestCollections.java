package com.demo.test.other.test._collections;

import java.util.Collections;
import java.util.List;

public class TestCollections<T> implements Comparable<T>{
	
	public static void main(String[] args) {
		Test test = new Test(0);
		List<Test> testlist = Collections.nCopies(3, test);
		test.run();
		System.out.println(testlist);
		
	}


	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Test{
	int count = 0;
	public Test(int count) {
		this.count = count;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		count++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Test"+this.count;
	}
}
