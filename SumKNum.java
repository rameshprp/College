import java.util.*;
public class SumKNum{
    public static void main(String args[]){        
        int sum = 0;
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();
		int[] arr=new int[n];
		int k=in.nextInt();
	    for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
              }
        for(int i=0;i<k;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
    } 
}
