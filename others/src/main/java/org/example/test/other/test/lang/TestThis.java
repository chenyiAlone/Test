package org.example.test.other.test.lang;

public class TestThis {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Dad d = new Son();
        d.play();
    }

}

abstract class Dad {
    abstract class Inner{
        abstract void run() throws Exception;
    }
    void test() {
        System.out.println("Dad");
    }
    void play() {
        Dad.this.test();
    }
}

class Son extends Dad{
    class NInner extends Inner{

        @Override
        void run()  throws Exception {
            throw new Exception();
//            System.out.println("");
            
        }
    }
    void test() {
        System.out.println("Son");
    }
}