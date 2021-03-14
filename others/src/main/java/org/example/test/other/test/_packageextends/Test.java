package org.example.test.other.test._packageextends;

public class Test extends WithInner.Inner{
	Test(){
		new WithInner().super();
	}
	Test(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		System.out.println(new Test());
	}
}

class WithInner{
	class Inner{}
}
