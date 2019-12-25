package Number;

public class revNum {
 public static void main (String arg[]){
	 int num = 153;
	 
	 int c = 1234%10;
	 int d = 1234/10;
	 
	 System.out.println(c);
	 System.out.println(d);
	 int rev=0;
	 while (num>0){
		int r=num%10;
		 rev=rev+r*r*r;
		 num = num/10;
		 
	 }
	 System.out.println(rev);
 }
}
