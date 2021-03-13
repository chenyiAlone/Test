package com.demo.test.test.remove;

public class test {
	public static void main(String[] args) {
		found();
	}
	
	public static void foundAnd(int count) {
	}
	
	
	//四位数和为10
	public static void found() {
		int a,b,c,d;
		for(a=1;a<10;a++) {
			for(b=0;b<=10-a;b++) {
				for(c=0;c<=10-a-b;c++) {
					for(d=0;d<=10-a-b-c;d++) {
						if(10==a+b+c+d)
							System.out.println(a*1000+b*100+c*10+d);
					}
				}
			}
		}
	}
	

}
