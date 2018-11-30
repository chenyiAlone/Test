package test._package.package3;

import test._package.package1.TestInterface;
import test._package.package2.Test2;

public class Test3 extends Test2{
	public static class staticInter{
		private int i = 20;	//静态类中不能引用外部非静态的属性和方法
	}
	public  Object toInter(){
		return this.new Inter();
	}
	public static void main(String[] args) {
//		TestInterface testInterface = new Test3().toInter();
//		testInterface.play();
		Object obj = new Test3().toInter();
		System.out.println(obj);
	}
	public static void paly() {
		int i = 20;
	}
}
