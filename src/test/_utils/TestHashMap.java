package test._utils;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("text", Integer.valueOf(1));
        HashMap<String, Integer> map2 = new HashMap<>(map);
        System.out.println("map: "+map);
        map.put("text", Integer.valueOf(2));
        System.out.println("map: "+map);
        System.out.println("map2: "+map2);
    }

}
