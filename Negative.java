import java.util.*;
class Negative{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<0 || n>10)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
