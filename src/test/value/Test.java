package test.value;

public class Test {
	public static void main(String[] args) {
		Value v1 = new Value(4); 
		Value v2 = v1;
		v2.next = new Value(5);
		v2 = v2.next;
		System.out.println(v1.next.value);
		System.out.println(v2.value);
	}

}
class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	Value next;
}