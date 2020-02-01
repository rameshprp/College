import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)==' '){
				++count;
			}
		}
		System.out.println(count);
	}
}
