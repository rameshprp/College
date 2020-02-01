import java.util.*;
import java.io.*;
class Isomorphic{
	static boolean find(String s1,String s2){
		int len1=s1.length();
		int len2=s2.length();
		int f=0;
		if(len1!=len2) {return false;}
		Boolean[] m=new Boolean[256];
		Arrays.fill(m,Boolean.FALSE);
		int[] arr=new int[256];
		Arrays.fill(arr,-1);
		
		for(int i=0;i<len1;i++){
			if(arr[s1.charAt(i)]==-1){
				if(m[s2.charAt(i)]==true)
					return false;
				m[s2.charAt(i)]=true;
				arr[s1.charAt(i)]=s2.charAt(i);
			}
			else if(arr[s1.charAt(i)]!=s2.charAt(i))
				return false;
		}
			return true;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		boolean s =find(s1,s2);
		if(s==true) System.out.println("YES");
		else System.out.println("NO");
	}
}
