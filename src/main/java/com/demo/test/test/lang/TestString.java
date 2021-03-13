package com.demo.test.test.lang;

public class TestString {
    static void testsubstring(String str, int beginIndex, int endIndex) {
        System.out.println(str.substring(beginIndex, endIndex));
    }
	public static void main(String[] args) {
	    String str = "12345";
	    testsubstring(str, 0, 1);
	    
//		String[] strs = "afdgfdgafdsfsdfahgfhfg".split("a");
//		System.out.println(strs.length);
//		int i=0;
//		System.out.println(strs[0]);
//		System.out.println(strs[0].length());
//		System.out.println(strs[0]=="");
//		System.out.println(strs[0].equals(""));
		System.out.println("\"\"==null:"+"".equals(null));
		
//		for(String str:strs) {
//			if(str==null) {
//				System.out.println("空串");
//			}
//			System.out.println(str+(i++));
//		}
	}
}
