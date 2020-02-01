import java.util.*;
class Leap{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int f=0;
		if(n%4==0){
			f=1;
		}
		else if(n%100==0){
			f=0;
		}
		else if(n%400==0){
			f=1;
		}
		else {
			f=0;
		}
		if(f==1)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}
