package com.demo.test.test._exception;

public class TestRuntimeException {
	public static void main(String[] args) {
		try {
			throw new RuntimeException(new MyRuntimeException());
//			int i =1/0;
		}
//		catch(Exception e){
//			throw e;
//		}
		finally {
		    return;
//			throw new IndexOutOfBoundsException();
		}
		
	}
		
}
class MyRuntimeException extends Exception{
	
}