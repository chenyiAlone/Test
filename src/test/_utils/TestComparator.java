package test._utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	static int i;
	int j;
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(7);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		for(;;) {
			System.out.println(i);
			return ;
		}
		
	}

}
