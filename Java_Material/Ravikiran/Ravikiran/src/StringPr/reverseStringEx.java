package StringPr;
public class reverseStringEx {

	static String param1 = "ravik" ;
	static String param2 = "Kiran" ;
	
	public static void main (String arg[])
	{
		//reverseStringEx s = new reverseStringEx();
		//s.reverseString2(param);
		System.out.println("Original String " + param1 + "  Recursive Reverser String " + reverseRecursively(param1));
		
		//System.out.println("Original String " + param1 + "  Reverser String " + reverseString2(param1));
		
	/*	String tst1 = reverseString2(param1);
		if (param1.equalsIgnoreCase(tst1))
		{
			System.out.println("polindrom");
		}
		
		else {
			System.out.println("not polindrom");
		}
		
		System.out.println("Original String " + param2 + "  Reverser String " + reverseString(param2));
		*/
	}
	
	public static String reverseString2(String param1)
	{
		char ch[] = param1.toCharArray();
		int i = 0 , j = ch.length-1;
		char temp;
		while (i<j)
		{
			temp = ch[i];
			ch[i] = ch[j];		
			ch[j] = temp;
			i++;
		  j--;
		}
		
		return new String(ch);
	}
	
	
	public static String reverseString(String param2)
			
			{
		 String reverse = "";
		 char[] ch = param2.toCharArray();
		 for (int i = param2.length()-1 ; i >= 0 ; i--)
		 {
			reverse = reverse + ch[i]; 
		 }			 
		 return reverse;
		}
	
	public static String reverseRecursively(String str) {
    //base case to handle one char string and empty string
	 
	        if (str.length() < 2) { 
	            return str;
	        }
	        System.out.println("String substring:  "  + str.substring(1) + "   String charAt: " + str.charAt(0)) ;
	        return reverseRecursively(str.substring(1)) + str.charAt(0);
	    }
		
}




















