package test._exception;

import java.util.NoSuchElementException;
class DataException extends Exception{}

public class TestException {
    public void testException() throws Exception {
        throw new DataException();
    }
	public static void main(String[] args) {
//		test2();
		double d = 0.235;
		System.out.format("%f", d);
		
	}
	public static void test3() {
		throw new RuntimeException();
	}
	public static void test2() {
		try {
			try {
				try {
					throw new NullPointerException();
				} catch (Exception e) {
					e.printStackTrace();
					//�������׳����try�����ܲ����쳣
					throw e;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void test1() {
		try {
			throw new NoSuchElementException();
		}catch(NoSuchElementException e) {
			e.printStackTrace(System.out);
			System.out.println("-----------�ָ���----------");
			e.printStackTrace();
			throw new RuntimeException(e);	//���쳣��װ������ʱ�쳣���׳�������ҪSystem.err���վͿ��Դ�ӡ����
		}
		
	}

}
