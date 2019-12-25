package DsHash;

public class TMHashMap 
{    

    // for simplicity size is taken as 2^4    
	private static final int SIZE = 16;    
	private Entry table[] = new Entry[SIZE];
	
    class Entry 
      {        
    	final String key;        
    	String value;        
    	Entry next;         
    	Entry(String k, String v) 
    	    {            
    		key = k;            
    		value = v;        
    		}         
    	public String getValue() 
    	    {            
    		return value;        
    		}         
    	public void setValue(String value) 
    	    {            
    		this.value = value;        
    		}         
    	public String getKey() 
    	    {            
    		return key;        
    		}    
       }
    
    
    public Entry get(String k) 
       {        
    	int hash = k.hashCode() % SIZE;        
    	Entry e = table[hash];         
    	// if bucket is found then traverse through the linked list and        
    	// see if element is present        
    	while(e != null) 
    	      {            
    		    if(e.key.equals(k)) 
    		    {                
    		    	return e;            
    		    }            
    		   e = e.next;        
    		 }       
    	   return null;    
    	   }
       
    
    public void put(String k, String v) 
    {        
    	int hash = k.hashCode() % SIZE;        
    	Entry e = table[hash];        
    	if(e != null) 
    	      {            
    		  // it means we are trying to insert duplicate            
    		  // key-value pair, hence overwrite the current            
    		  // pair with the old pair            
    		     if(e.key.equals(k)) 
    		     {                
    		    	 e.value = v;            
    		     } 
    		     else 
    		     {                
    		    	 // traverse to the end of the list and insert new element                
    		    	 // in the same bucket                
    		    	 while(e.next != null) 
    		    	    {                    
    		    		 e = e.next;                
    		    		 }                
    		    	Entry entryInOldBucket = new Entry(k, v);                
    		    	e.next = entryInOldBucket;            
    		    	
    		     }        
    		  } 
    	else 
    		  {            
    		   // new element in the map, hence creating new bucket            
    		   Entry entryInNewBucket = new Entry(k, v);            
    		   table[hash] = entryInNewBucket;        
    		   }    
    	
    	}
    public static void main(String[] args) 
    {        
    	TMHashMap tmhm = new TMHashMap();   
    	tmhm.put("", "Kiran");
    	tmhm.put("Niranjan", "SMTS");       
    	tmhm.put("Ananth", "SSE");        
    	tmhm.put("Niranjan", "SMTS1");        
    	tmhm.put("Chandu", "SSE");    
    	tmhm.put("R", "O");
    	tmhm.put("p", null);
    	Entry e = tmhm.get("p");        
    	System.out.println(""+e.getValue()); 
    }
    		        
}
    
    
    
    
    
    
    
    
    
	
