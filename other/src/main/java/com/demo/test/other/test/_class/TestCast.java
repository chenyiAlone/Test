package com.demo.test.other.test._class;
/**
 * 
 * 测试Class: T cast(Object o)类型转化
 * @author chenyiAlone
 *
 */
public class TestCast {
    public static void main(String[] args) {
        Base b = new Implem();
        System.out.println(b.getClass().getName());
        System.out.println(Implem.class.cast(b).getClass());
        // 其实就是相当于(A)B这种强制类型转化
        test(Implem.class.cast(b));
    }
    static void test(Implem i) {
        
    }

}

class Base{}

class Implem extends Base{}