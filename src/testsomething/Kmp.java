package testsomething;

public class Kmp {
	public static void main(String[] args) {
		String str = "abaabcac";
		int[] array= next(str);
		for(int i = 1;i<array.length;i++){
			
			System.out.print(array[i]+" ");
		}
		
	}
	public static int[] next(String str) {
		int[] next = new int[str.length()+1];
		char[] chars = new char[str.length()+1];
		int k = 1;
				for(char c:str.toCharArray()) {
					chars[k++]=c;
				};
				
		next[1]=0;
		
		int
			i=1,
			j=0;
		
		while(i<str.length()) {
			if(j==0||chars[i]==chars[j]) {
				i++;
				j++;
				next[i]=j;
			}
			else
				j=next[j];
		}
		
		
		
		
		
		return next;
	}

}
