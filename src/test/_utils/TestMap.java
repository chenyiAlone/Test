package test._utils;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "test");
        map.put(2, "map");
        map.put(3, "foreach");
        
        // jdk 1.8 �м�����µı�������
        map.forEach((Integer,String)->{
            
            System.out.println(Integer);
            System.out.println(String);
        });
    }
}
