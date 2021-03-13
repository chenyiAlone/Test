package com.demo.test.test.lang;

public class TestClass {
    public static void main(String[] args) {
        //  Fruit f = new Fruit();
        //  Apple a = Apple.class.cast(f);
        //  System.out.println(a.getClass());
        Fruit af = new Apple();
        Apple a = Apple.class.cast(af);
        System.out.println(a.getClass() + "-->" + a);
    }
}
class Apple extends Fruit {}
class Fruit {}