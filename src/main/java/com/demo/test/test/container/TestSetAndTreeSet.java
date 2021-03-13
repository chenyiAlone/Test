package com.demo.test.test.container;

import java.util.IdentityHashMap;
import java.util.TreeSet;

public class TestSetAndTreeSet {
	public static void main(String[] args) {
		Apple 
			a1 = new Apple(),
		a2 = new Apple();
		TreeSet<Apple> appTreeSet = new TreeSet<>();
		appTreeSet.add(a1);
		appTreeSet.add(a2);
		System.out.println("-----------TreeSet----------");
		System.out.println(appTreeSet);
		IdentityHashMap<Apple,String> appIdntityHashMap = new IdentityHashMap<>();
		appIdntityHashMap.put(a1, "1");
		appIdntityHashMap.put(a2, "2");
		System.out.println("-----------IdentityHashMap----------");
		System.out.println(appIdntityHashMap);
		
	}
}
class Apple implements Comparable<Apple>{
	int size = 0;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Apple"+size;
	}

@Override
public int compareTo(Apple o) {
	// TODO Auto-generated method stub
	return 0;
}}