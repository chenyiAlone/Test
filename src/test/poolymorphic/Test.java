package test.poolymorphic;

public class Test {

public static void test (A a){
a.move();

}
public static void main(String[] args) {
	
	test(new B());
}



}
class A{
	static {
		System.out.println("A����ʼ��");
	}
	public void move(){
		System.out.println("move()-->�ƶ���!");

	}
}
class B extends A{
	static{
		System.out.println("B����ʼ��");
	}
}