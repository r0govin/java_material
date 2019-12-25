package StringPr;

public class StringToInter {

	public static void main (String arg[])
	
	{
		String param = "420";
		System.out.println("Original String  " + param);
		System.out.println("Converted Value " + stringToint(param));
		
	}	
	
	public static int myStringToInteger(String str) {
	    int answer = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        answer += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
	    return answer;
	}
	
	public static int stringToint(String param)
	{
		int result = 0;
		for (int i = 0 ; i < param.length(); i++)
		{
			result = result * 10  + param.charAt(i) - '0'; 
		}
		return result;
	}

}


















