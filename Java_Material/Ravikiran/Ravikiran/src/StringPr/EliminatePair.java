package StringPr;

public class EliminatePair {

	public static void main(String[] args) {
		String str = "GAVVIIKKP";
		char ch[] = str.toCharArray();
		EliminatePair ep = new EliminatePair();
		System.out.println(ep.removeAdjacentPair(ch));
		
	}
	
	char[] removeAdjacentPair(char[] str) {     
		int len = str.length;     
		int i,j=0;     
		for(i=1; i < len; i++) {         
			while((str[i]==str[j]) && (j >= 0)) {             
				i++;             
				j--;         
				}                    
			str[++j] = str[i];     
			}     
		str[j+1]='\0';       
	 return str;	
	}
	

}
