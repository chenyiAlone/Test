
public class TestStatic {
	public static void main(String[] args) {
		int a=A.get(); 
		System.out.println(a);
	}
}
class A{
	private static B a;
	static {
		a= new B();
		int c = a.a;
		c = 999;
	}
	public static int get() {
		return a.a;
	}
}
class B{
	int a;
	int b;
	public B(){
		a= 10;
		b= 5;
	}
}
abstract class  C{
	void run() {
		System.out.println(print());
	}
	abstract int print();
	
}