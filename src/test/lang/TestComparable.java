package test.lang;

public class TestComparable {
	public static void main(String[] args) {
		System.out.println("A".compareTo("B"));
		System.out.println(Integer.valueOf(5).compareTo(Integer.valueOf(4)));
		System.out.println("---------------------------");
		System.out.println('A'-'C');
		char a = 'A';
		char c = 'C';
		System.out.println((int)a);
		System.out.println((int)c);
		System.out.println((int)a-(int)c);
	}

}
