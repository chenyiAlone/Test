package com.demo.test.test.lang;

public class Test {
	char c;
	public static void main(String[] arg) {
		char c = new Test().c;
	
		System.out.println(""+c=="");
		System.out.println(""+c==null);
		System.out.println("\u0000".length());
		System.out.println("".equals(Character.valueOf(c).toString()));
	}

}
