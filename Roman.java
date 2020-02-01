import java.util.*;
class Roman{
	static int number(char s){
		if(s=='I') return 1;
		if(s=='V') return 5;
		if(s=='X') return 10;
		if(s=='L') return 50;
		if(s=='C') return 100;
		if(s=='M') return 500;
		if(s=='D') return 1000;
		return -1;
	}
	static int find(String s){
		int len=s.length();
		int r=0;
		for(int i=0;i<len;i++){
			int s1=number(s.charAt(i));
			if(i+1<len){
				int s2=number(s.charAt(i+1));
				if(s1>=s2){
					r=r+s1;
				}
				else{
					r=r+s2-s1;
					i++;
				}
			}
			else{
				r=r+s1;
				i++;
			}
		}
		return r;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		Player p=new Player();
		String s=in.nextLine();
		int st=p.find(s);
		System.out.println(st);
	}
}
