package com.demo.test.test._collections;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "com/demo/test/test");
        map.put(2, "map");
        map.put(3, "foreach");
        
        // jdk 1.8 中加入的新的遍历方法
        map.forEach((Integer,String)->{
            
            System.out.println(Integer);
            System.out.println(String);
        });
    }
}
