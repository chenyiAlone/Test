package com.demo.test.test.generics;

/**
 * 继承实现了带有泛型参数的接口的父类时，不需要带有父类实现的型参数，并且可以加入自己的类型参数
 * @author chenyiAlone
 *
 * @param <T>
 * @param <E>
 * 
 * 复习 11.28
 */
public class TestGenericsExtends<T, E> extends Generiscs {
    
}
// 继承实现了Comparable接口的类不能再次实现这个类来完成对当前类的直接比较
//public class TestGenericsExtends extends Generiscs implements Comparable<TestGenericsExtends>{
    
//}
class Generiscs implements Comparable<Generiscs>{

    @Override
    public int compareTo(Generiscs o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}