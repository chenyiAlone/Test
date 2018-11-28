package test._collections;

import java.util.HashMap;
import java.util.Map;
/**
 * ����	Map<K,V> �� K �� V ������
 * 
 * @author chenyiAlone
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		
		//Map<K,V>�в�����K�ظ�������VΪnull
		map.put("1",null);
		map.put("2", new Object());
		map.put("3", new Object());
		map.put("4", new Object());
		for(String s:map.keySet()) {
			System.out.println(map.get(s).hashCode());
			
		}
	}

}
