package org.example.test.other.test.lang;
/**
 * char[i] 的效率和 string.charAt(i) 的效率是相当的
 * 
 * ClassName: TestcharAtVschar
 * @author chenyiAlone  
 * Create Time: 2019/05/06 17:29:46
 * Description: TODO
 */
public class TestcharAtVschar {
    public static void main(String[] args) {
        test(1000000000);
    }
    
    private static void test(long count) {
        String s = "Demonstrate all the questions on LeetCode in the form of animation";
        long len = s.length();
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < count; i++) {
            char c = s.charAt((int)(i % (long)s.length()));
        }
        
        
        System.out.println("String.charAt() use time is : " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        char[] words = s.toCharArray();
        for (long i = 0; i < count; i++) {
            char c = words[(int)(i % (long)words.length)];
        }
        
        
        System.out.println("char[] use time is : " + (System.currentTimeMillis() - startTime));
        
    }

}
