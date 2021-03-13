package com.demo.test.test.lang;

public class TestStatic {
	public static void main(String[] args) {
		
		
		
		Sstatic 
		s1 = new Sstatic(),
		s2 = new Sstatic(),
		s3 = new Sstatic(),
		s4 = new Sstatic(),
		s5 = new Sstatic(),
		s6 = new Sstatic();
//		System.out.println(Sstatic.count);
//		System.out.println(Sstatic.count);
//		System.out.println(Sstatic.count);
//		System.out.println(Sstatic.count);
//		System.out.println();
	}
}
class Sstatic{
	public static int count=0;
	static {
		System.out.println("访问了静态域"+"-->"+count);
	}
	
}