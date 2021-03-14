package org.example.test.other.test._interface;

public class TestInterface implements Obj{
	public static void main(String[] args) {
		String str = new TestInterface().create("HelloWord!");
		System.out.println(str);
	}

	@Override
	public String create(Object o) {
		return o+"";
	}
}

interface Obj{
	Object create(Object o);
}
