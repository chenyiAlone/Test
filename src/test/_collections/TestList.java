package test._collections;

import java.util.ArrayList;
import java.util.List;
/**
 * ���� List<E> printʱ�Ƿ�������󲢵��ö���� toString() ����
 * @author chenyiAlone
 *
 */
public class TestList {
	public static void main(String[] args) {
		List<Demo> list = new ArrayList<>();
		list.add(new Demo());
		test(list);
		System.out.println(list);
		
	}
	public static void test(List<Demo> list) {
		Demo d = list.get(0);
		d.count = 10;
		list.set(0, d);
	}

}
class Demo{
	int count = 0;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+count;
	}
}
