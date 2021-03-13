package com.demo.test.other.test.lang;

public class TestMain {
	public static void main(String[] args) {
		SecondMain.main(args);
	}

}

class SecondMain{
	public static void main(String[] args) {
		System.out.println("SecondMain.main(args)");
	}
	void run() {}
	
}