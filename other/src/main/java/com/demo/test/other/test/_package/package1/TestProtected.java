package com.demo.test.other.test._package.package1;

public class TestProtected  extends Extendsed{
	private Extendsed extendsed;
	public TestProtected() {
		extendsed = new Extendsed();
	}
	public void print() {
		System.out.println(extendsed);
		System.out.println("TestProtected.print();!");
	}
	public static void main(String[] args) {
		new TestProtected();
	}
}

class Extendsed {
	public void print() {
		System.out.println("Extendsed.print();！");
	}
	public Extendsed(){
		 System.out.println("**********");
		 print();
		 System.out.println("**********");
	 }
}
