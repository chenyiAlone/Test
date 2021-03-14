package org.example.test.other.testsomething;

public class Init {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++ == 1 && i ==2);
//        int[] array = {1, 2, 3, 4};
//        int id = 0;
//        System.out.println(id = 2);
//        Integer i = Integer.valueOf(2);
//        change(i);
//        System.out.println(i = 4);
//        System.out.println(i);
    }
    public static void change(Integer i) {
        i.valueOf(4);
    }
}
