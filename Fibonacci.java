import java.util.*;
class Fibonacci{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int f=1,s=1;	
		for(int i=0;i<n;i++){
			System.out.print(f+" ");
			int temp=f+s;
			f=s;
			s=temp;
		}		
	}
}
