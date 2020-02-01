import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class Date1{
	//30
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		String m=in.nextLine();
		SimpleDateFormat f=new SimpleDateFormat("HH:mm");
		Date d1=null;
		Date d2=null;
		try{
			d1=f.parse(n);
			d2=f.parse(m);
			long diff=d2.getTime()-d1.getTime();
			long diffh=diff/(60*60*1000)%24;
			long diffm=diff/(60*1000)%60;
			System.out.println(diffh+" "+diffm);
		}
		catch(Exception e){
		e.printStackTrace();}
	}
}
