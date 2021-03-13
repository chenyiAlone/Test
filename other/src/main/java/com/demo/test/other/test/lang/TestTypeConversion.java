package com.demo.test.other.test.lang;

import java.util.ArrayList;
import java.util.List;

public class TestTypeConversion {
    public static void testTypeConversion() {
        ArrayList<Integer> arrl = new ArrayList<>();
        List<Integer> list = (List<Integer>) arrl;
        System.out.println(list.getClass().getName());
    }
    public static void main(String[] args) {
        testTypeConversion();
    }
}
