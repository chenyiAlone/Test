package test._collections;

import java.util.HashMap;
import java.util.Map;
/**
 * 测试	Map<K,V> 中 K 和 V 的属性
 * 
 * @author chenyiAlone
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		
		//Map<K,V>中不允许K重复，或者V为null
		map.put("1",null);
		map.put("2", new Object());
		map.put("3", new Object());
		map.put("4", new Object());
		for(String s:map.keySet()) {
			System.out.println(map.get(s).hashCode());
			
		}
	}

}
