package test._utils;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("I", 1);
		map.put("am",2);
		map.put("a",2);
		map.put("student",3);

		System.out.println("ȡֵǰ-->"+map);
		System.out.println(map.get("a"));
		System.out.println("��һ��ȡֵ��-->"+map);
		System.out.println(map.get("student"));
		System.out.println("�ڶ���ȡֵ��-->"+map);
	}

}
