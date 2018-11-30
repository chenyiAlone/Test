package test._collections;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("I", 1);
		map.put("am",2);
		map.put("a",2);
		map.put("student",3);

		System.out.println("取值前-->"+map);
		System.out.println(map.get("a"));
		System.out.println("第一次取值后-->"+map);
		System.out.println(map.get("student"));
		System.out.println("第二次取值后-->"+map);
	}

}
