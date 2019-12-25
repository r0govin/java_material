package Fun;

import java.util.Scanner;

public class mirrorNum {
	public static void main (String arg[])
	{
		int guess = 765;
		int mirNum =0;
		int sum = 0, sumsquare = 0;
		int arry[] = null;
		String temp = Integer.toString(guess);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
			
		for (int p = 0 ; p <newGuess.length ; p++){
			sum += newGuess[p];
			sumsquare += newGuess[p] * newGuess[p];
			System.out.println(newGuess[p]);
		}
		
	System.out.println("Sum: " + sum + "  Square " + sumsquare);
	
	mirNum = (guess/sum) - (guess/sumsquare);
	System.out.println("Mirror Number is " + mirNum);
	
	}
}
