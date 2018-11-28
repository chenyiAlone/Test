package test.anonymityinner;
/**
 * 测试局部内部类对外部对象的属性的访问
 * @author 丶尘逸c
 *
 */
public class Test {
	/**
	 * 测试共用同一个实例化对象引用时，两个局部内部类对该类的属性的访问
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
	 * 测试非共用同一个实例化对象引用时，两个局部内部类对该类的属性的访问
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
		//共用
//		test01();
		//非共用
//		test02();
	}

}
class Outer{
	private int count = 0 ;
	//两个类都是返回Counter接口的实例化对象
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