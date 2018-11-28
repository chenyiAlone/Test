package test._sort;

import java.util.TreeSet;
/**
 * ����TreeSet��Ĭ�ϵ�Comparableʹ�õ�����ʽ
 * @author ؼ����c
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
		 * Ĭ������ʽthis������Ƚϣ�����Ϊ1��С��Ϊ-1�����Ϊ0
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
