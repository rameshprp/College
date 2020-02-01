import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int max=0;int sum=0;
		for(int i=1;i<n;i++){
			sum+=arr[i];
		}
		max=sum/n;
		System.out.println(max);
	}
}
