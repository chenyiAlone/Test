package test;

import test.iterfacr2.Dog;

public class Test1 {
	public static void main(String[] args) {
		C c= new C();
		
	}
}
class A{
	private Dog dog = new Dog("A");
	static {
		System.out.println("初始化A的静态属性！");
	}
	A(){
		System.out.println("调用A的构造器!");
	}
}
class B extends A{
	private Dog dog = new Dog("B");
	static {
		System.out.println("初始化B的静态属性！");
	}
	B(){
		System.out.println("调用B的构造器!");
	}
}
class C extends B{
	private Dog dog = new Dog("C");
	static {
		System.out.println("初始化C的静态属性！");
	}
	C(){
		System.out.println("调用C的构造器!");
	}
}
