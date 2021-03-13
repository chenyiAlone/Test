package com.demo.test.other.test.lang;

public class TestTry {
    public static void main(String[] args) {
        System.out.println(testFinally());
    
    }
    public static String testFinally() {
        try {
            return "return";
        }finally {
            return "finally~";
//            System.out.println("finally!");
        }   
    }
    
    
    
    
    
    public static void test(){
        try {
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
//                        throw e;
                    }
                    System.out.println("5000等待结束！");
                };
            }.start();;
        }catch(Exception e){
            System.out.println("catch!!");
        }finally {
            System.out.println("finally!!!");
        }
    }

}
