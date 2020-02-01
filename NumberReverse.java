import java.util.*;
class NumberReverse.java{
	static int find(int n){
		int r=0;
		while(n>0){
			int f=n%10;
			r=r*10+f;
			n=n/10;
		}
		return r;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int st=find(s);
		System.out.println(st);
	}
}
