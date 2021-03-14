package org.example.test.other.test._enum;

import java.lang.reflect.Method;

public class TestEnum {
	public static void main(String[] args) {
		Eat[] eats = Eat.APPLE.getClass().getEnumConstants();
		if(null!=eats)
			for(Eat e :eats)
				System.out.println(e.name());
		System.out.println(String.class.getEnumConstants());
		
		
	}
	public static void test03() {
		Eat e  = Enum.valueOf(Eat.class, "APPLE");
		System.out.println(e.name());
		System.out.println();
		System.out.println(e.getDeclaringClass());
		System.out.println();
		for(Method m :e.getClass().getMethods())
			System.out.println(m.getName());
		
		
	}
	public static void test02() {
		
		for(MyEnum myEnum:MyEnum.values()) {
			System.out.println(myEnum.print());
		}
	}
	public static void test01() {
//!		System.out.println(Eat instanceof Food);
		for(Eat e:Eat.values()) {
			e.eat();
		}
		System.out.println(Eat.APPLE instanceof Food);
		Eat eat = Eat.valueOf("CHINKEN");
		System.out.println(eat.name());
		System.out.println(eat.ordinal());
		Eat eAT = Eat.SOUP;
		
	}
}

interface Food{void eat();}

enum Eat implements Food{
	CHINKEN,SOUP,APPLE;

	@Override
	public void eat() {
		System.out.println("eat();");
		
	}
}

enum MyEnum{
	TESET(10,"my"),VOID(50,"ms"),INETEST(2);
	private int i;
	private MyEnum(int i,String str) {this.i = i;this.str = str;System.out.println("调用了构造器！");}
	private MyEnum(int i) {this.i =i;}
	private String str;
	public void setStr(String str) {
		this.str = str;
	}
	public String print() {
		return this.i+"-->"+this.str;
	}
//	public MyEnum() {
//		
//	}
//	private MyEnum(String str) {
//		this.str = str;
//	}
}