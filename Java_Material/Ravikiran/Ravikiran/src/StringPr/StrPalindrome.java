package StringPr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrPalindrome {
	static String n;
	static int l;
	 public static void main(String args[]) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new
	 InputStreamReader(System.in));
	 // Read the String
	 System.out.print("Enter a String : ");
	 n = br.readLine();
	 l = n.length();
	 Palindrome();
	 }
	 public static void Palindrome()
	 {
	 int f = -1;
	 for(int i=0;i<=l/2;i++)
	 {
	  if(n.charAt(i)!=n.charAt(l-1-i))
	  {
	   f=1;
	   break;
	  }
	 }
	 if(f==-1)
	  System.out.println("\n" +n +" is a Palindrome");
	 else
	  System.out.println("\n" +n +" is NOT a Palindrome");
	 }

}
