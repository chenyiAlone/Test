package test.lang;

public class TestEnum {
	public static void main(String[] args) {
		EnumTest.run();
		for(EnumTest t:EnumTest.values()) {
			System.out.println(t.name());
		}
	}
}
enum EnumTest{
	CAR,BUS,SHIP;
	public static void run() {
		System.out.println("run();");
	}
}
