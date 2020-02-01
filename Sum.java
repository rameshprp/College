import java.util.*;
public class Sum{
    public static void main(String args[]){        
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int  x = s.nextInt();
	    for(int i=0;i<=x;i++){
            sum = sum +i;
              }
        System.out.println(sum);
    } 
}
