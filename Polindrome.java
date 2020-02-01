import java.util.*;
public class Polindrome{
    public static void main(String args[]){        
        Scanner in=new Scanner(System.in);
      String n=in.nextLine();
		int i=0;int f=0;
		int l=n.length()-1;
		while(i<l){
			if(n.charAt(i)==n.charAt(l)){
				f=1;
			}
			else{
				f=0;
			}
			i++;l--;
		}
		if(f==1)
			System.out.println("YES");
		else
			System.out.println("NO");
    } 
}
