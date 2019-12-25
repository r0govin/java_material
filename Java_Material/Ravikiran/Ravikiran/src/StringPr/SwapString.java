package StringPr;

public class SwapString {
	public static void main(String arg[]){

		String st1 = "ravi";
		String st2 = "kiran";
		SwapString sp = new SwapString();
		sp.swapString(st1, st2);
	   }

	    public void swapString(String para1, String para2){
	    	String s1 = para1;
	    	String s2 = para2;
	    	System.out.println(s1 +" " + s2);
	    	
	    	int len = para1.length();
	    	s1 = para1 + para2;
	    	s2 = para1.substring(0, len);
	    	s1 = s1.substring(len);
	    	System.out.println(s1 +" " + s2);
	    }
}
