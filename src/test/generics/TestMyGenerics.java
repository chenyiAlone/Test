package test.generics;

import java.util.ArrayList;
import java.util.List;

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
  
//��Ϊ��Dû�м̳�SelfBounded�����Ը������ʧ�ܡ�  
//class E extends SelfBounded<D>{}  
  
