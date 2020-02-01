import java.util.*;
class Armstrong{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=n;
		int c=0;
		while(n>0){
			int v=n%10;
			c=c+v*v*v;
			n=n/10;
		}
		if(c==t)
		System.out.println("YES");
	else
		System.out.println("NO");
	}
}
