﻿package test.lang;

public class Testargs {
	public static void main(String[] f) {
		System.out.println("mian();中的参数可以修改");
		throw new RuntimeException();
	}
}
