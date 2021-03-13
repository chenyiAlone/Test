package com.demo.test.test.lang;

public class TestLocal {
    class Test{
        private String str = "Test";
        public void testLocal(String str) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        new TestLocal().new Test().testLocal("NotTestLocal");
    }

}
