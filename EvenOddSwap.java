import java.util.*;
import java.io.*;
class EvenOddSwap{
	static void find(String s){
		int n=s.length();
		int m=n/2;char[] arr=new char[n];
		char[] a1=new char[m];
	    char[] a2=new char[m];
		int j=0,g=0;
		for(int i=0;i<n;i+=2){	a1[j]=s.charAt(i);   j++;  }
		for(int i=1;i<n;i+=2){	a2[g]=s.charAt(i);   g++;  }
		// merging the two arrays          abcd badc
		int k=0,l=0;
		for(int i=0;i<n;){ 
			if(l<a1.length && k<a2.length){
			arr[i++] = a2[l];l++;
			arr[i++] = a1[k];k++;
			}
		}
		for(int i=0;i<n;i++)
		System.out.print(arr[i]);
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		find(str);
	}
}
