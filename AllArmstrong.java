import java.util.*;
class AllArmstrong{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		for(int i=n+1;i<m;i++){
			int c=0;
			int t=i;
			while(t>0){
			int v=t%10;
			c=c+v*v*v;
			t=t/10;
			}
		if(c==i)
		System.out.println(i+" ");
		}
	}
}
