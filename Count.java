import java.util.*;
public class Count{
    public static void main(String args[]){        
        int sum = 0;
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();
	    while(n>0){
			sum++;
			n=n/10;
		}
		System.out.println(sum);
    } 
}
