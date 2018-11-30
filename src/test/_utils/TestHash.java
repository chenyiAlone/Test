package test._utils;

public class TestHash {
	public static void main(String[] args) {
//		HashMap;
		Hash[] hashs = {new Hash("Hello"),new Hash("Hello"),new Hash("Hello")};
		System.out.println(hashs[0].hashCode());
		System.out.println(hashs[1].hashCode());
		System.out.println(hashs[2].hashCode());
	}

}
class Hash{
	String str;
	public Hash(String str){
		this.str = str;
	}
	
}
