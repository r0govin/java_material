package StringPr;

/*
Write a Program in Java to input a word and print its anagrams..
Note: Anagrams are words made up of all the characters present in the original word by re-arranging the characters.
Example: Anagrams of the word TOP are: TOP, TPO, OPT, OTP, PTO and POT
*/

public class AllAnagram {
	
	
	      public static char[] charArray;
	     
          public void changeOrder(int newsize) {
	        int j;
	        int pointAt = charArray.length - newsize;
	        char temp = charArray[pointAt];
	        for (j = pointAt + 1; j < charArray.length; j++) {
	            charArray[j - 1] = charArray[j];
	           }
	        charArray[j - 1] = temp;
	        }

	    public void doAnagram(int newsize) {
	        if (newsize == 1) {
	            return;
	        }
	        for (int i = 0; i < newsize; i++) 
	            {
	            doAnagram(newsize - 1);
	            if (newsize == 2) 
	                {
	                display();
	                 }
	            changeOrder(newsize);
	           }
	    }

	    public void display() {
	        for (int i = 0; i < charArray.length; i++) {
	            System.out.print(charArray[i]);
	        }
	        System.out.println();
	    }
	    
	    public static void main(String args[]) {
	    	AllAnagram test1 = new AllAnagram();
	    	String word = "top" ;
	    	charArray = word.toCharArray();
	    	test1.doAnagram(charArray.length);
	    }

}
