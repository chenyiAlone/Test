package com.demo.test.test.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void genrm(Foo... fs) {
    }
    public static void main(String[] args) {
        Foolm proxied = new Foolm();
        InvocationHandler h = new FooInvocationHandler(proxied);
        Are f = (Are) Proxy.newProxyInstance(null, new Class[] {Are.class}, h);
//        System.out.println(f.toString() == null);
        f.test2();
        genrm();
        

    }
}
class FooInvocationHandler implements  InvocationHandler {
    private Object proxied;
    public FooInvocationHandler(Object proxied) {
        this.proxied = proxied;
        // TODO Auto-generated constructor stub
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy.getClass());
//        System.out.println(proxied.getClass());
//        return null;
        // TODO Auto-generated method stub
//         method.invoke(proxy, args);
//        System.out.println("method.name = " + method.getName());
        return method.invoke(proxied, args);
    }
}
interface Er {
    void test2();
}
interface Are extends Er, Foo{
    
}
class Foolm implements Are {

    @Override
    public void test() {
        System.out.println("Foo.com.demo.test.test()!");
        // TODO Auto-generated method stub
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "eshi";
    }
    @Override
    public void test2() {
        // TODO Auto-generated method stub
        System.out.println("Er.test2()!");
        
    }
    
}
interface Foo{void test();}
