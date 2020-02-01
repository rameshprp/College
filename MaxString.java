import java.util.*;
class GuviSet4{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();	
		if(s1.charAt(0)>s2.charAt(0))
			System.out.println(s1);
		else
			System.out.println(s2);
	}
}
