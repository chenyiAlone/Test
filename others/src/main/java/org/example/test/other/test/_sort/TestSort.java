package org.example.test.other.test._sort;

import java.util.TreeSet;

/**
 * 测试TreeSet的默认的Comparable使用的排序方式
 * @author 丶尘逸c
 *
 */
public class TestSort {
	public static void main(String[] args) {
		new TestSort().test();
	}
	public void test() {
		TreeSet<IntSort> treeset = new TreeSet<>();
		
		for(int i = 10;i>0;i--) {
			treeset.add(new IntSort(i));
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(treeset);
	}
	public class IntSort implements Comparable<IntSort>{
		int i;
		public IntSort(int i) {
			this.i = i;
		}
		@Override
		public String toString() {
			return Integer.toString(i);
		}
		
		/**
		 * 默认排序方式this与参数比较，大于为1，小于为-1，相等为0
		 */
		@Override
		public int compareTo(IntSort arg0) {	
			int arg = ((IntSort)arg0).i;
			return i>arg?1:(i<arg?-1:0); 
		}
//		@Override
//		public int compareTo(IntSort arg0) {
//			int arg = ((IntSort)arg0).i;
//			return i>arg?-1:(i<arg?1:0); 
//		}
		
	}
}
