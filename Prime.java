import java.util.*;
public class Prime{
    public static void main(String args[]){        
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();int f=0;
	  if(n==0 || n==1){
		  System.out.println("NO");
	  }
	  else{
		  for(int i=1;i<=n;i++){
			if(n%i==0){
				f=1;
			System.out.println("No");break;
			}
		}		
	  }
		if(f==0)
			System.out.println("YES");
    } 
}
