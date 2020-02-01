import java.util.*;
public class Power{
    public static void main(String args[]){        
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();
		int m=in.nextInt();
	    for(int i=1;i<m;i++){
			n=n+n;
		}
		System.out.println(n);
    } 
}
