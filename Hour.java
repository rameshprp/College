import java.util.*;
class Hour{	
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int h=n/60;
		int m=n%60;
		System.out.println(h+" "+m);		
	}
}
