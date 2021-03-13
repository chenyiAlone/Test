package com.demo.test.other.test._collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试非指定类型的容器能否储存的不同的类型
 * @author chenyiAlone
 *
 */
public class TestDiff {
    private class Apple {}
    private class Banana {}
    public static void main(String[] args) {
        List l = new ArrayList();
        // 内部类需要使用外部类进行初始化
        TestDiff t = new TestDiff();
        l.add(t.new Apple());
        l.add(t.new Banana());
    }

}
