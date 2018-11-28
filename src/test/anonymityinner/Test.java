package test.anonymityinner;
/**
 * ���Ծֲ��ڲ�����ⲿ��������Եķ���
 * @author ؼ����c
 *
 */
public class Test {
	/**
	 * ���Թ���ͬһ��ʵ������������ʱ�������ֲ��ڲ���Ը�������Եķ���
	 */
	public static void test01() {
		Outer outer = new Outer();
		Counter counter1 = outer.getCounter1("inner");
		Counter counter2 = outer.getCounter2("inner");
		for(int i=0;i<5;i++) {
			counter1.count();
			counter2.count();
		}
	}
	/**
	 * ���Էǹ���ͬһ��ʵ������������ʱ�������ֲ��ڲ���Ը�������Եķ���
	 */
	public static void test02() {
		Outer outer1 = new Outer();
		Outer outer2 = new Outer();
		Counter counter1 = outer1.getCounter1("inner");
		Counter counter2 = outer2.getCounter2("inner");
		for(int i=0;i<5;i++) {
			counter1.count();
			counter2.count();
		}
	}
	public static void main(String[] args) {
		//����
//		test01();
		//�ǹ���
//		test02();
	}

}
class Outer{
	private int count = 0 ;
	//�����඼�Ƿ���Counter�ӿڵ�ʵ��������
	Counter getCounter1(final String name) {
		class LocalCounter implements Counter{

			@Override
			public void count() {
				
				System.out.println("LocalCounter " + name + " " + count++);
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2 (final String name) {
		return new Counter() {

			@Override
			public void count() {
				System.out.println("AnonymityCounter " + name + " " + count++);
			}
		};
	}
}
interface Counter{
	void count();
}