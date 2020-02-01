import java.util.*;
class fact{
	static int find(int n){
		int r=1;
		while(n>0){
			r=r*n;
			n--;
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
