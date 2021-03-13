package com.demo.test.test._collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator iterator = list.iterator();
        System.out.println(iterator.next());
//        list.add(5);
        list.set(1, 10);
        System.out.println(iterator.next());
    }

}
