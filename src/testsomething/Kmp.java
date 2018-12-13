package testsomething;

public class Kmp {
	public static void main(String[] args) {
		String str = "abaabcac";
//		int[] array = next(str);
//		for(int i = 1; i < array.length; i++){
//			System.out.print(array[i] + " ");
//		}
		System.out.println(kmpSearch("bacbababadababacambabacaddababacasdsd", "ababaca"));
	}
	
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
	
	
	
	
	public static int[] next(String str) {
		int[] next = new int[str.length() + 1];
		char[] chars = new char[str.length() + 1];
		int k = 1;
		for (char c : str.toCharArray()) {
			chars[k++] = c;
		};
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
