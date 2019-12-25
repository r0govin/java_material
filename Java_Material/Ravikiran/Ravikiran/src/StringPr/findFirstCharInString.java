package StringPr;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findFirstCharInString {
	public static void main(String arg[]){
		String str1 = "abcabp";
		findFirstCharInString t1 = new findFirstCharInString();
		System.out.println(str1+" First Non repeated "+t1.nonRepHash(str1));	
		}

		public char nonRepeat(String s1){
			char ch[] = s1.toCharArray();
			Arrays.sort(ch);
			char temp = 0;
			for (int i =0; i <ch.length-1; i ++){
			  if (ch[i]!=ch[i+1]){
				  temp = ch[i+1];			  
			  }
			  else return 0;
			}
			return temp;
		}
		
		public char nonRepHash(String s1){
			Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
			char temp = 0;
			int count = 0 ;
		    char[] ch1 = s1.toCharArray();
		    for (char c: ch1){
		    	Character cr = (Character)c;
		    	if (mp.containsKey(cr)){
		    		mp.put(cr, count+1);
		    	}
		    	else
		          mp.put(cr, count);
		    }
		  	
		    for(Entry<Character, Integer> et : mp.entrySet())
			{
		    	if (et.getValue()==0)
		    	{
		    		temp = et.getKey();
		    		break;
		    	}	    	
			}    
		    return temp;
		    
		}
		
}
