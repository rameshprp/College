import java.util.*;
class PosNeg{
public static void main(String []args){
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  if(n>0){
    System.out.println("Positive");
  }
  else if(n<0){
    System.out.println("Negative");
  }
  else
    System.out.println("Zero");
}
}
