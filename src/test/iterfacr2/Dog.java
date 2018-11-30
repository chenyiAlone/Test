package test.iterfacr2;

public class Dog extends Animal{
	public Dog(String name) {
		System.out.println("初始化非静态属性"+name);
	}
	public Dog() {
	}
	public void run() {
		System.out.println("Dog !跑跑跑跑");
		
	}
	public void dog() {
		System.out.println("汪汪汪汪汪");
	} 

}
