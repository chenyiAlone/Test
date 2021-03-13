package com.demo.test.other.test.generics;

import java.util.ArrayList;
import java.util.List;

class Hold <T>{}

public class Testgeneric {
	public static void main(String[] args) {
	    new NoCons() {}.test();
	    Hold<?> h = new Hold<Integer>();
		holdadd(h);
	}
	public static void holdadd(Hold<?> h) {
	    hold(h);
	}
	public static <T> void hold(Hold<T> h) {
	    
	}
	
	public static void test() {
	    List<?  super Apple> list1 = new ArrayList<Apple>();
	    list1.add(new Apple());
	    Object apple1 = list1.indexOf(new Apple());
	    Object a  = list1.get(0);
	    List<?  extends Apple> list2 = new ArrayList<Apple>();
//        list2.add(new Apple());
	    Apple apple2  = list2.get(0);
	    
//		list.add(new Fruit());
	    
//		List<Fruit> list; 
//!		list = new ArrayList<Apple>();
//!		list.add(new Apple());
//!		list.add(new Fruit());     List不支持类似于数组的协变类型
	    
	}
	/**
	 * 测试运行泛型是否存在
	 */
	public static void test2() {
		Object[] os = new Object[2];
		Integer[] is = (Integer[])os;
		is[1] = 2;
		System.out.println(is);
		
//		System.out.println(is instanceof Integer[]);
	}
		public static void test1() {
		
	List<? extends Integer> intList = new ArrayList<Integer>();
	List<? extends String> strList = new ArrayList<String>();
	System.out.println("intList.getClass().equals(strList.getClass()):"
			+intList.getClass().equals(strList.getClass()));
	}
	
}

class Apple extends Fruit {}

class Fruit {}

class  NoCons{ NoCons(){}
    public void test() {System.out.println("success!");}
}
//class SonCons extends NoCons{}


