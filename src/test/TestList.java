package test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		System.out.println((list!=null&&list.size()>0)?list.get(0):null);
	}

}
