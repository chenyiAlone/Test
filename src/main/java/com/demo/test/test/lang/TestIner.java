package com.demo.test.test.lang;

import java.util.ArrayList;
import java.util.List;

public class TestIner {
	public static void main(String[] args) {
		Car car = new Car(1,2,3,4,5,6);
		Car.CarTest cartest = car.cartest;
		System.out.println(cartest.run());
		System.out.println(cartest.run());
		System.out.println(cartest.run());
		System.out.println(cartest.run());
		System.out.println(cartest.run());
		System.out.println(cartest.run());
		
	}

}
class Car{
	CarTest cartest = new CarTest();
	List<Integer> array = new ArrayList<>();
	public CarTest testCar() {
		return cartest;
	}
	public Car(int...is) {
		for(int i :is)array.add(i);
	}
	class CarTest{
		int count = 0;
		int run(){
			return array.get(count++);
		}
	}
	
}