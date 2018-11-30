package test.lang;

public class TestFor {
	{
		int i =39;
	}
	public static void main(String[] args) {
		System.out.println(test1());
	}
	public static String test1() {
	    
		for(;;) {
			System.out.println("test for(;;);");
			return "return";
		}
	}

}
