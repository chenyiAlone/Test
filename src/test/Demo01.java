package test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		Fruit<String> fruit = new Fruit<String>();
//!		fruit.set(12);
		fruit.set("as");
	}
	public static void testType() {
		Type[] types = Color2.class.getTypeParameters();
		System.out.println("==");
		for(Type t:types) {
			System.out.println(t.getTypeName());
		}
		
	}
	public static void testList() {
		Fruit[] fruits = new Apple[5];
		fruits[0] = new Fruit();
		List<Orange> olist = new ArrayList<Orange>();
		List<? extends Fruit> list = new ArrayList<>();
		list.contains(new Orange());
//!		list.add(new Apple());		//-->编译器会限制一切拥有泛型的方法，例如：add(E e);
//!		list.add(new Object());
		
	}
}

class Fruit<T>{
	void set(T t) {
		System.out.println(t);
	} 
}
class Apple extends Fruit{}
class Orange extends Fruit{}
class Clazz1{}
class Clazz2 extends Clazz1{}
class Clazz3 extends Clazz2{}

class Color<T extends Clazz2>{}

class Color2<T extends Clazz3> extends Color<T>{}


class F{
	class B{
		final static int a = 5;
//		static void ptint() {
			
//		}
	}
	
	
}
