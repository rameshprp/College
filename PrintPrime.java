import java.util.*;
public class PrintPrime{
    public static void main(String args[]){        
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();int f=0;
	  int m=in.nextInt();
	  for(int i=n+1;i<m;i++){
		  for(int j=2;j<i;j++){
			if(i%j==0) {
				f=0;
				break;
			} 
			else{f=1;}
		  }
		  if(f==1){System.out.print(i+" ");}
	  }
    } 
}
