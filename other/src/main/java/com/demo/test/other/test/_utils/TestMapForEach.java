package com.demo.test.other.test._utils;

import java.util.HashMap;

/**
 * 
 * ClassName: TestMapForEach
 * @author chenyiAlone  
 * Create Time: 2019/01/23 16:39:30
 * Description: 
 *      测试 Map 的forEach操作
 */
public class TestMapForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.forEach((K, V)-> {
            System.out.println("key = " + K + "  value = " + V);
        });
    }
}
