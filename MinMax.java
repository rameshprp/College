import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++){
			if(max<arr[i]){max=arr[i];}
		}
		for(int i=1;i<n;i++){
			if(min>arr[i]){min=arr[i];}
		}
		System.out.println(min+" "+max);
	}
}
