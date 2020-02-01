import java.util.*;
public class Numeric{
    public static void main(String[] args){
		Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        boolean nu=true;
        try{
            Double num=Double.parseDouble(s);
        }catch(NumberFormatException e){
            nu=false;
        }
        if(nu)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
