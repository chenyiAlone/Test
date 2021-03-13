package com.demo.test.other.test.poolymorphic;

public class Test {

public static void test (A a){
a.move();

}
public static void main(String[] args) {
	
	test(new B());
}



}

class A{
	static {
		System.out.println("A被初始化");
	}
	public void move(){
		System.out.println("move()-->移动了!");

	}
}

class B extends A{
	static{
		System.out.println("B被初始化");
	}
}