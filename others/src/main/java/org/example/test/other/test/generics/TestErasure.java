package org.example.test.other.test.generics;

public class TestErasure<T extends Dad> {
    private T t;
    public TestErasure(T t) {
        this.t = t;
        // TODO Auto-generated constructor stub
    }
    public T test() {
        return t;
    }
    public void canshu(Dad d ) {
        
    }
    public static void main(String[] args) {
        Dad son = new Son();
        System.out.println(son);
        TestErasure test = new TestErasure(new Son());
        Dad d = test.test();
        System.out.println(d);
//        Son s = com.demo.test.test.com.demo.test.test();
//        System.out.println(s);
        test.canshu(new Dad() {});
        
    }
}

interface Dad {}

class Son implements Dad {}