import java.util.*;
class AppendString{
	static String find(String str){
		int len=str.length();
		String r=".";
		r=str+r;
		return r;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String st=find(s);
		System.out.println(st);
	}
}
