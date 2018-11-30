package test._exception;

public class TestThrow {
	public static void main (String[] args) throws Exception {
		new MyException().textThrow();
//		throw new RuntimeException(new MyException());
//			try {
//				throw new RuntimeException(new MyException());
//			} catch (Exception e) {
//				try {
//					throw e.getCause();
//				} catch (Throwable e1) {
//					e1.printStackTrace();
//				}
//			}
	}

}
class MyException extends Exception{
    public void textThrow() {
        try {
            set();
        }catch(Exception e) {
            
            System.out.println(e.getMessage());
            System.out.println("----------------");
//            System.out.println(e.getLocalizedMessage());
        }
    }
	public  void set() throws Exception {
		throw new Exception("ceshi"); 
	}
	
}