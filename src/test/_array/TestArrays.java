package test._array;

import java.util.Arrays;
class Count{
	int counter = 0;
	public Count(int counter) {
		this.counter = counter;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return counter+"";
	}
}
public class TestArrays {

	public static void main(String[] args) {
		Count[] counts = {new Count(2),new Count(3)};
		printArray(counts);
		Count[] count = {new Count(10)};
		System.arraycopy(counts, 1, count, 0, 1);
		printArray(counts);
		count[0].counter++;
		System.out.println(count[0].counter);
		printArray(counts);
		
		
		test02();
	}
	public static <T> void printArray(T[] t) {
		for(T temp:t) {
			System.out.print(temp+",");
		}
		System.out.println();
		
	}
	public static void test02() {
		Integer[] is = {2,6,7,4,2};
		System.out.println(Arrays.binarySearch(is,2));
		
	}
	public static void test01() {
		Integer[] is = new Integer[4];
		for(int i = 0;i<4;i++) {
			is[i] = (int)(Math.random()*10);
		}
		printArray(is);
		System.out.println(Arrays.binarySearch(is,4));
		Arrays.sort(is);
		printArray(is);
		System.out.println(Arrays.binarySearch(is,4));
	}
}
