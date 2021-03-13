package com.demo.test.test.iterfacr;

public class Test {
	public static void main(String[] args) {
//		sort();
	}
	public static void sort(String[] arr,Animal a) {
		a.run();
	}
	Animal cat = new Cat();
//	Animal dog = new Dog();
	
	Animal a = new Animal() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	};

}
