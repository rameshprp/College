import java.util.*;
import java.io.*;
class CamelCase{
	static String find(String s){
		int len=s.length();
		char[] arr=s.toCharArray();
		if((int)(s.charAt(0))>96 && (int)(s.charAt(0))<123){
			arr[0]=(char)((int)(s.charAt(0))-32);
		}
		for(int i=1;i<len;i++){
			if((int)(s.charAt(i))>64 && (int)(s.charAt(i))<91){
				arr[i]=(char)(s.charAt(i)+32);
			}
			else
				arr[i]=s.charAt(i);
		}
		String b = new String(arr);
		return b;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String s=find(str);
		System.out.println(s);
	}
}
