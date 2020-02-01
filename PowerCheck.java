import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(find(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	static boolean find(int n){
		if(n==0) return false;
		while(n!=1){
			if(n%2!=0)
				return false;
			n/=2;
		}
		return true;
	}
}
