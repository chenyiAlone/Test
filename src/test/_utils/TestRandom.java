package test._utils;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i =0;
        while(i<50) {
            System.out.println(rand.nextInt());
            i++;
        }
    }
}
