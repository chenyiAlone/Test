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
		System.out.println("��ʼ��A�ľ�̬���ԣ�");
	}
	A(){
		System.out.println("����A�Ĺ�����!");
	}
}
class B extends A{
	private Dog dog = new Dog("B");
	static {
		System.out.println("��ʼ��B�ľ�̬���ԣ�");
	}
	B(){
		System.out.println("����B�Ĺ�����!");
	}
}
class C extends B{
	private Dog dog = new Dog("C");
	static {
		System.out.println("��ʼ��C�ľ�̬���ԣ�");
	}
	C(){
		System.out.println("����C�Ĺ�����!");
	}
}
