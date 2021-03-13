package com.demo.test.algorithms.heap;
/**
 * 
 * 堆排序
 * 
 * 以最大堆为例，重要的三个方法:
 *      insert
 *      delete
 *      adjust
 *      
 *      
 * 重点的代码
 *      
 *      while (parent * 2 <= size) {
 *          // ...
 *          if (child != size && maxHeap[child] < maxHeap[child + 1])
 *              child++;
 *          // ...
 *      }
 * 
 * 
 * 
 * 
 * 
 *  1. maxHeap[elements.lenght + 1], maxHeap[0] = Integer.MAX_VALUE;
 *  2. insert into sorted maxHeap:
 *          int index = ++size; 
 *          while (maxHeap[index / 2] < x) {
 *              maxHeap[index] = maxHeap[index / 2];
 *              index /= 2;
 *          } 
 *          max[index] = x;
 *          
 *  3. delete from sorted maxHeap:
 *           int tmp = maxHeap[size--];
 *           int parent = 1;
 *           while (parent * 2 <= size) {
 *              int child = parent * 2;
 *              if (child != size && maxHeap[child] < maxHeap[child + 1]) 
 *                  child += 1;
 *              if (maxHeap[parent] > maxHeap[child])
 *                  break;
 *              else
 *                  maxHeap[parent] = maxHeap[child];
 *                   
 *              parent = child;
 *           }
 *           maxHeap[parent] = tmp;
 *           
 *           
 *  4. adjust non-sorted to sorted
 *          size = len + 1;
 *          for (int i = size / 2; i > 0; i--) {
 *              int parent = i;
 *              while (parent * 2 <= size) {
 *                  int child = parent * 2;
 *                  if (child != size && maxHeap[child] < maxHeap[child + 1])
 *                      child += 1;
 *                  if (maxHeap[parent] > maxHeap[child])
 *                      break;
 *                  else
 *                      maxHeap[parent] = maxHeap[child];
 *                  parent = child;
 *              }
 *              maxHeap[child] = tmp;
 *          }
 *  
 * 
 * 
 * ClassName: MaxHeap
 * @author chenyiAlone  
 * Create Time: 2019/05/11 18:41:57
 * Description: TODO
 */
public class MaxHeap {
    private static int size = 0;
    
    public static void main(String[] args) {
       int[] maxHeap = new int[10];
       maxHeap[0] = Integer.MAX_VALUE;
       int[] arr = {1, 2, 3, 4, 5};
       initMaxHeap(maxHeap, arr);
       printArray(arr, arr.length);
       printArray(maxHeap, size + 1);
    
       //printArray(maxHeap);
       //insert(maxHeap, 1);
       //insert(maxHeap, 2);
       //insert(maxHeap, 3);
       //insert(maxHeap, 4);
       //insert(maxHeap, 5);
    
       //printArray(maxHeap);
       //delete(maxHeap);
       //printArray(maxHeap);
       //delete(maxHeap);
       //printArray(maxHeap);
       //delete(maxHeap);
       //printArray(maxHeap);
       //delete(maxHeap);
       //printArray(maxHeap);
    
    }

    private static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void insert(int[] maxHeap, int x) {
        int index = ++size;
        while (maxHeap[index / 2] < x) {
            maxHeap[index] = maxHeap[index / 2];
            index /= 2;
        }
        maxHeap[index] = x;
    }
    
    private static void initMaxHeap(int[] maxHeap, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            maxHeap[i + 1] = arr[i];
        }
        size = arr.length;
        for (int i = size / 2; i > 0; i--) {
            int tmp = maxHeap[i];
            int parent = i, child = 0;
            while (parent * 2 <= size) {
                child = parent * 2;
                if (child != size && maxHeap[child] < maxHeap[child + 1])
                   child++;
                if (tmp >= maxHeap[child])
                    break;
                else
                    maxHeap[parent] = maxHeap[child];
                parent = child;
            }
            maxHeap[parent] = tmp;
        }
    }
    
    private static int delete(int[] maxHeap) {
        int res = maxHeap[1];
        int tmp = maxHeap[size--];
        int parent = 1;
       
        while (parent * 2 <= size) {
            int children = parent * 2;          
            children = (children != size && maxHeap[children] < maxHeap[children + 1]) ? children + 1 : children;
            if (tmp >= maxHeap[children])
                break;
            maxHeap[parent] = maxHeap[children];
            parent = children;
        }
        maxHeap[parent] = tmp;
        return res;
        
        
        
       // for ( ; parent * 2 <= size; parent = children) {
       //     children = parent * 2;
       //     if (children != size && maxHeap[children] < maxHeap[children + 1]) {
       //         children++;
       //     }
       //     if (tmp >= maxHeap[children])
       //         break;
    //         else
    //             maxHeap[parent] = maxHeap[children];
       // }
    }
}
