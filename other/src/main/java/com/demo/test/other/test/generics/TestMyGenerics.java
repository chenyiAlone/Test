package com.demo.test.other.test.generics;

public class TestMyGenerics {
	
	public static void main(String[] args) {  
		A a=new A();  
		a.set(new A());  
		a=a.set(new A()).get();  
		a=a.get();  
		C c=new C();  
		c=c.setAndGet(new C());  
//		List ds = new ArrayList();
		
	}  
}

/**
 * Created by msc on 2017/1/15. 
 */  
class SelfBounded<T extends SelfBounded<T>>{  
    T element;  
    SelfBounded<T> set(T arg){  
        element=arg;  
        return this;  
    }  
    T get(){return element;}  
}

class A extends SelfBounded<A>{}

class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{  
    C setAndGet(C arg){  
        set(arg);  
        return get();  
    }  
}

class D extends A{}

class F extends A{}
  
//因为类D没有继承SelfBounded，所以该类编译失败。  
//class E extends SelfBounded<D>{}  
  
