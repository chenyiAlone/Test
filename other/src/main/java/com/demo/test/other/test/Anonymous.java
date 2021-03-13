package com.demo.test.other.test;

public class Anonymous {
	public Base base() {
		return new Base() {
			public void f() {
				super.f();
				System.out.println("anonymous.f();");
			}
		};
	}
	public static void main(String[] args) {
		Base base = new Anonymous().base();
		base.f();
	}

}

class Base{
	public void f() {
		System.out.println("Base.f();");
	}
}
