package org.example.test.other.test._collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
//        set.add(new Student());
    }
    
    interface Person{}
    class Student implements Person{}

}
