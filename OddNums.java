import java.util.*;
public class OddNums{
    public static void main(String args[]){        
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();int f=0;
	   int m=in.nextInt();
	   for(int i=n+1;i<m;i++){
		   if(i%2!=0)
			   System.out.print(i+" ");
	   }
    } 
}
