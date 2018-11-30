package test.concurrency;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class TestDelayQueue {
    public static void main(String[] args) {
    }
    class MyDelayQueue implements Delayed{

        @Override
        public int compareTo(Delayed o) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            // TODO Auto-generated method stub
            return 0;
        }
        
    }
}
