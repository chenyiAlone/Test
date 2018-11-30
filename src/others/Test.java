package others;

public class Test {

	public static void main(String[] args) {
		HFApple apple = new HFApple();
		apple.eat();
		((Fruit)apple).eat();
		((Apple)apple).eat();
		Integer a = 4;
		String[] b = {"a","v"};
		System.out.println(b[1].compareTo(b[0]));
		System.out.println("============父类引用==============");
		
		
		Apple apple2 = new HFApple();
		apple2.eat();
//		Apple apple3 = new Apple();
//		((HFApple)apple3).eat();
	}


}
