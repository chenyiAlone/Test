package org.example.test.other.test.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		String[] str = ("Every year, on March 12th, our school will have the special"
				+ " activity. We need to plant trees in the campus. We are so excited to see trees growing every day. "
				+ "The tree I planted last year now is very tall. I am so proud to see its growth. I have made a contribution "
				+ "to bringing the world green and protecting the environment.").split(" ");
//		System.out.println(Arrays.toString(str));
		ReversedArrayList<String> list = new ReversedArrayList<String>(Arrays.asList(str));
//		System.out.println(list);
		for(String s:list) {
			System.out.println(s);
		}
		for(Object obj:new MyIterator()) {
			
		}
	}
}

class MyIterator implements Iterable{
	
	
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class ReversedArrayList<T> extends ArrayList<T>{
	public ReversedArrayList(List<T> list) {
		super(list);
	}
	public Iterable<T> reversed(){
		return new Iterable<T>(){

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
//			public Iterator<T> iterator(){
//				return new Iterator<T>() {
//					private int count = size()-1;
//					@Override
//					public boolean hasNext() {
//						return count>-1;
//					}
//					@Override
//					public T next() {
//						return get(count--);
//					}
//				};
//			}
		};
	}
}