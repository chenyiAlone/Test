package org.example.test.other.test._exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Body {
	private static Logger logger = Logger.getLogger("LoggingException2");
	static void logExcepiton(Exception e) {
		StringWriter strwit = new StringWriter();
		e.printStackTrace(new PrintWriter(strwit));
//		System.out.println(strwit.toString());
		logger.severe(strwit.toString());
	}
	public static void main(String[] args) {
        try {
			new Body().a();
        	throw new Exception();
		}  catch (Exception e) {
			logExcepiton(e);
//			e.printStackTrace();
		}

    }
    public void a() throws Exception {
        try {
            b();
        } catch (Exception e) {
            System.out.println("a这里错误了");
//            e.printStackTrace();
            logExcepiton(e);
            throw e;
        } 
    }
    public void f() throws Exception {
    	throw new Exception("新的");
    }
    public void b() throws Exception  {

        try {
        	f();
            int i = 1;
            int j = 0;
            int f;
//            f = i / j;
        } catch (Exception e) {
            System.out.println("b这里错误了");
//            e.printStackTrace();
            logExcepiton(e);
            throw e;
        } 
    }
    

}
