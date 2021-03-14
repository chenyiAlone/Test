package org.example.test.other.test._collections;

import java.util.PriorityQueue;

public class TestPriorityqueue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(new My(9));
        queue.add(new My(5));
        queue.add(new My(8));
        for(Object o :queue) {
            System.out.println(o);
        }
        System.out.println();
        queue.add(new My(4));
        for(int i =0;i<queue.size();i++) {
            System.out.println(queue.poll());
        }
    }

}

class My implements Comparable<My>{
    public My(int i) {
        // TODO Auto-generated constructor stub
        this.i = i;
    }
    int i;
    @Override
    public int compareTo(My o) {
        return this.i-o.i;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getClass().getName()+"-->" + i;
    }
}
