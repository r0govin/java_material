package StringPr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numerals2words {
	public static void main(String args[]) throws IOException
	{
	BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	numerals2words call = new numerals2words();
	System.out.print("Enter a number : ");
	int n = Integer.parseInt(br.readLine());
	call.convert(n);
	}
	public void convert(int n)
	{
	int c;
	if(n!=0)
	{
	c = n%10;
	convert(n/10);
	num2words(c);
	}
	}
	public void num2words(int n)
	{
	String words[] =
	{"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	System.out.print(words[n] +" ");
	}
}
