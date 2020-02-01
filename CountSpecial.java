import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9')
			{}
		   else ++count;
		}
		System.out.println(count);
	}
}
