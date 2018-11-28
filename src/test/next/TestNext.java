package test.next;

public class TestNext {
	 public static void main(String[] args){
		 //        ABCDABD
	 	String ch="ABCDABD";
	 	int[] next = new int[8];
	 	next = makeNext(ch);
	 	for(int i:next) {
	 		System.out.print(i+" ");
	 	}
	}
	 public static int[] makeNext(String str){
		 char[] ch = str.toCharArray();
		 int[] next = new int[ch.length+1];
		 int i=1;
		 next[1]=0;
		 int j=0;
		 while(i<ch.length){
			 if(j==0||ch[i]==ch[j]){
				 ++i;
				 ++j;
				 next[i]=j;
			 }
			 else
				 j=next[j];
		 }
		 return next;
		 
	 }


}
