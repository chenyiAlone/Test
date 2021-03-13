package com.demo.test.other.test.outerInter;

public class Outer {
	private int count = 0;
	public class Inter{
		public Inter() {
			System.out.println("新建Inter类");
		}
		public void play() {
			System.out.println("Inter.Play();" + count++);
		}
		public Outer out() {
			return Outer.this;
		}
	}
	public void play() {
		System.out.println("Outer.play();");
	}
	public  Inter getInter() {
		return new Inter();
	}
	public Outer() {
		System.out.println("新建Outer类");
	}
	public static void main(String[] args) {
		Outer out = new Outer();
		Inter inter1 = out.getInter();
		Inter inter2 = out.getInter();
		for(int i =0;i<5;i++) {
			inter1.play();
			inter2.play();
		}
		
//		inter.play();
//		System.out.println(out);
//		Inter inter2 = new Outer().new Inter();
//		Outer out2 = inter.out();
//		System.out.println(out2); 
//		out2.play();
	}

}

class Outer2{
	public class Inter{
		public Inter() {
			System.out.println("新建Inter类");
		}
		public void play() {
			System.out.println("Play();");
		}
	}
}