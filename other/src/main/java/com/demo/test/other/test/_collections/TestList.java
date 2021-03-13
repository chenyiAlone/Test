package com.demo.test.other.test._collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试List能否加入为0的多个Integer对象
 * @author chenyiAlone
 *
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        System.out.println(list.size());
        for (int i : list) {
            System.out.println(i);
        }
        List<Integer> ls = new ArrayList<>();
        System.out.println(ls.containsAll(list));
    }

}
