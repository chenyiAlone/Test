package test._utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * 
 * Comparator<E> 可以对任意类型进行排序
 * compare(k1, k2):
 *      1. k1 > k2: return +; 升序
 *      2. k1 > k2: return -; 降序 
 * 
 * 
 * ClassName: TestComparator
 * @author chenyiAlone  
 * Create Time: 2019/05/11 18:26:48
 * Description: TODO
 */
public class TestComparator {
    
    
    
	static int i;
	int j;
	public static void main(String[] args) {
	    
	    testNoComparableElements();
	}
	
	public static void testNoComparableElements() {
	    Comparator<Node> nodeComparator = new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {
                
                return o1.val - o2.val;
            }
            
        };
	    SortedSet<Node> set = new TreeSet<>(nodeComparator);
	    set.add(new Node(1));
	    set.add(new Node(2));
	    set.add(new Node(3));
	    for (Node i : set)
	        System.out.print(i + " ");
        System.out.println();
        
        int res = nodeComparator.compare(new Node(1), new Node(2));
	    System.out.println("res = " + res);
	}
	
	
	public static void testCompareComparable() {
	    
	    SortedSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                
                return o2 - o1;
            }
	        
	    });
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    for (int i : set)
	        System.out.print(i + " ");
	    System.out.println();
	    
	    
	}
	
	
	
	
	public static void testListWithComparator() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(7);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		for(;;) {
			System.out.println(i);
			return ;
		}
		
	}

}

class Node {
    int val;
    public Node(int i ) {
        this.val = i;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.val + "";
    }
}