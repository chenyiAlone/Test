package com.demo.test.other.test._for;

import java.util.Map;

public class _for {
	public static void main(String[] args) {
		for(Map.Entry entry:System.getenv().entrySet()){
			System.out.println(entry.getKey()+ "-->"+entry.getValue());
		}
	}
}
