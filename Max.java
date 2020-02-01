import java.util.*;
class Max{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<3;i++){
			arr[i]=in.nextInt();
		}
	    int max=arr[0];
		for(int i=0;i<3;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
		System.out.println(max);
	}
}
