package testsomething;

import static util.Utils.*;

public class MaximalRectangle {
    public int largestInLine(int[] height) {
        if (height == null || height.length < 1)
            return 0;
        int[] stack = new int[height.length + 1];   // heights + 1 => [..., 0]
        int len = 0, max = 0;
        for (int i = 0; i <= height.length; i++) {
            int h = (i == height.length) ? 0 : height[i];   // 使用局部变量转移heights[i] + 0
            while (len != 0 && (i == height.length || height[stack[len - 1]] > h)) {
                if (len == 1)
                    max = Math.max(height[stack[--len]] * i, max);
                else
                    max = Math.max(height[stack[--len]] * (i - stack[len - 1] - 1), max);
            }
            stack[len++] = i;
            
            printArray(stack);
        }
        return max;
    }
    
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        int[] stack = new int[heights.length + 1];
        int len = 0;
        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            while (len != 0 && (i == heights.length || heights[stack[len - 1]] > h)) {
                if (len == 1) 
                    res = Math.max(res, heights[stack[--len]] * i);
                else 
                    res = Math.max(res, heights[stack[--len]] * (i - stack[len - 1] - 1));
            }
            stack[len++] = i;
            for (int t : stack) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        return res;
    }
    public static void main(String[] args) {
        
        int[] heights = {2,1,5,6,2,3};
        System.out.println(new MaximalRectangle().largestRectangleArea(heights));
    }
}
