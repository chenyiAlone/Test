package com.demo.test.test.remove;

import java.util.Iterator;

public class TestList implements java.lang.Iterable{
	String[] element = {"s","b","d","w"};
	int size = element.length;
	
	private class MyIter implements Iterator{
			
			private int corsor = -1;
			
			public boolean hasNext() {
				return corsor+1 < size;
			}
			
			
			public void remove() {		//删除当前游标所在的位置的元素
				
				System.arraycopy(element, corsor+1, element, corsor,size -corsor-1);
				size--;            //SimpleList.this.size--;
				corsor--;
			}
			
			
			public Object next() {
				return element[++corsor];
			}
		}
		
		
		public Iterator iterator(){
			return new MyIter();
		}
		
	
	
	
	public static void main(String[] args) {
		TestList list = new TestList();
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			
		}
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		
	}

}
