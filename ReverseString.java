import java.util.*;
class ReverseString{
	static String find(String str){
		int len=str.length();
		String r="";
		int j=len-1;
		for(int i=0;i<len;i++){
			r=r+str.charAt(j);
			j--;
		}
		return r;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String st=find(s);
		System.out.println(st);
	}
}
