package com.demo.test.other.testsomething;


import static com.demo.test.other.util.Utils.printArray;

public class Kmp {
	public static int[][] createDFA(String pattern) {
	    
        int M = pattern.length();
        int R = 256;
        int[][] dfa = new int[R][M];
        dfa[pattern.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
//            printArray(dfa[pattern.charAt(0)]);
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][X];
            dfa[pattern.charAt(j)][j] = j + 1;
            X = dfa[pattern.charAt(j)][X];
                
        }
        
        
        return dfa;
    }
	
	public static void testKmp(String s) {
	    printArray(next(s));
	}
	
    public static void main(String[] args) {
		String str = "baabab";
		testKmp(str);
		
		
		/*
		int[][] dfa = createDFA(str);
		for (int i = 'a'; i <= 'c'; i++) {
		    System.out.print((char)i+ " ");
	    
//		    printArray(createDFA(str)[i]);
		    printArray(dfa[i]);
		}
		*/
//		int[] array = next(str);
//		for(int i = 1; i < array.length; i++){
//			System.out.print(array[i] + " ");
//		}
//		System.out.println(kmpSearch("bacbababadababacambabacaddababacasdsd", "ababaca"));
	}
	/**
	 * kmp 1
	 * @param str
	 * @param pattern
	 * @return
	 */
	public static int kmpSearch(String str, String pattern) {
	    int n = str.length(), m = pattern.length();
	    int ans = -1;
	    int kmp[] = new int[m + 1];
	    kmp[0] = -1;
	    kmp[1] = 0;
	    
	    int i = 1;
	    int len = 0;
	    while (i < m) {
	        if (pattern.charAt(i) == pattern.charAt(len)) {
	            len++;
	            kmp[i + 1] = len;
	            i++;
	        } else {
	            if (len > 0) {
	                len = kmp[len];
	            } else {
	                kmp[i + 1] = len;
	                i++;
	            }
	            
	        }
	    }
	    
//	    for (int temp : kmp) {
//	        System.out.print(temp + " ");
//	    }
//	    System.out.println();
	    i = 0;
        int j = 0;
	    while (i < n) {
	        if (str.charAt(i) == pattern.charAt(j)) {
	            if (j == m - 1) return i - j; 
	            i++;
	            j++;
	        } else {
	            j = kmp[j];
	            if (j == -1) {
	                i++;
	                j++;
	            }
	        }
	    }
	    return ans;
	}
	
	public static int search(String txt) {
	    
	    
	    return 0;
	}
	
	
	
	public static int[] next(String str) {
		int[] next = new int[str.length() + 1];
		char[] chars = new char[str.length() + 1];
		int k = 1;
		for (char c : str.toCharArray()) {
			chars[k++] = c;
		};
		next[0] = -1;
		next[1] = 0;
		int
			i = 1,
			j = 0;
		while (i < str.length()) {
			if (j == 0 || chars[i] == chars[j]) {
				i++;
				j++;
				next[i] = j;
			} else
				j = next[j];
		}
		return next;
	}
}
