package test._utils;

import java.util.ArrayList;

public class TestList {
    public static void testListElementEquals() {
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList l2 = new ArrayList();
        l2.add(2);
        l2.add(1);
        l2.add(3);
        System.out.println(l1.equals(l2));
    }
    public static void main(String[] args) {
        testListElementEquals();
    }
}
