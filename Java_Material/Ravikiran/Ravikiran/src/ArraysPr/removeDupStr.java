package ArraysPr;

public class removeDupStr {

	//String str[] =a,b,c,c,d,d,a,e, ; remove duplicate from given array, without using collection
	
	public static void main (String arg[]){
		
	  String str ;
	  String[] ch = { "a", "b", "c", "c", "d", "d", "a", "e" };
      
       int n = ch.length;
     
       int i , j, mod_len = 0 ;
       char temp;
       for  ( i = 0 ; i < n; i ++)
       {
    	   for (j = i+1; j < n -1; j ++)
    	   {
    	     if (ch[i]==ch[j])
    	     {
    	    	 mod_len++;
    	    	 ch[i]= null;  	    	
    	    	 break ;
 	   	     }
    	   }
       }
       
       int mod = n - mod_len;
       
       String ch2[] = new String[mod];
       
       int k = 0;
       for (String st : ch) {
			if (st == null) {}
                 else {
	               ch2[k] = st;
				k++;}
			}
		
       
       for (String s : ch2)
       {
    	   System.out.println(s);
       }
  
	}
}
