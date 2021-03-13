package com.demo.test.test._invoke;

public class TestInvoke {
//	sMethod m = Method_Obj.class.getMethod("com.demo.test.test",new TypeElement[]{});
	

}
class Method_Obj{
	public String test(String str1,String str2) {
		StringBuilder str = new StringBuilder();
		str.append(str1).append(str2);
		System.out.println("Method_Obj==>"+str.toString());
		return str.toString();
	}
}
