package org.example.test.other.test.lang;
/**
 * 
 * ClassName: TestEnum
 * @author chenyiAlone  
 * Create Time: 2019/01/05 18:51:33
 * Description: 
 *  1.枚举类构造器必须私有
 *  2.可以拥有静态和非静态方法
 *  3.调用方法必须使用枚举对象实例
 *  4.num[] values() + Enum valueOf(String arg0) 编译器增加的方法
 *  5.Enum实例对象获取的class对象才能使用T[] getEnumContants()
 */
public class TestEnum {
	public static void main(String[] args) {
		EnumTest.run();
		for(EnumTest t:EnumTest.values()) {
			System.out.println(t.name());
		}
		EnumTest.CAR.test();
		EnumTest.SHIP.test();
		Enum[] enums1 = EnumTest.CAR.getClass().getEnumConstants();
		EnumTest[] enums2 = EnumTest.CAR.getClass().getEnumConstants();
//		EnumTest.com.demo.test.test();
	}
}

enum EnumTest {
	CAR,BUS,SHIP(10);
    public int count;
    private EnumTest(int count) {
        this.count = count;
    }
    private EnumTest() {}
	public static void run() {
		System.out.println("run();");
	}
	public void test() {
	    System.out.println("count = " + count);
	}
}
