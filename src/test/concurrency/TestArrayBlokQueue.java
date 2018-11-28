package test.concurrency;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlokQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Item> abq = new ArrayBlockingQueue<Item>(10);
        PriorityQueue<Item> pq = new PriorityQueue<Item>(10);
        pq.add(new Item());
        pq.add(new Item());
        pq.add(new Item());
        pq.add(new Item());
        
    }
}
class Item implements Comparable{

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}