package test._for;

public class TestArguments {
	public static void print(String... strs) {
		if(strs==null) {
			System.out.println("�ɱ�����Ϊ��");
		}
		for(String str:strs) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
//		print(null);
		print(new String[] {"fsdfsd","1561"});
	}
}  
 