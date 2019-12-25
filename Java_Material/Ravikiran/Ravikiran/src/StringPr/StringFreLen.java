package StringPr;

public class StringFreLen {
public static void main (String arg[]){
		
		String str1 = "aaabbaacccbb";
		StringFreLen s = new StringFreLen();
		s.strFrqLen(str1);
	}
	
	public void strFrqLen(String para){
		int count=1 ;
		char temp = 0;
		for (int i = 0; i < para.length()-1; i++){
			 if (para.charAt(i) == para.charAt(i+1)){
				 temp = para.charAt(i)  ;
				 count ++;
			 }
			 else
			 {
				 System.out.println(para.charAt(i) + " " + count);
				 count = 1;
			 }		 
		}
		System.out.println(temp + " " + count);
	}
	
}
