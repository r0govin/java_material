package ArraysPr;

public class MissingNummberInArray {
	public static void main (String arg[]){
		int[] arry1 ={1,2,3,4,5,7};
		int[] arry2= {2,4,8,10};
		int[] arry3= {3,6,9,12,18,21};
		int[] arry5 ={5,15,20,25,30};
		
		MissingNummberInArray ma = new MissingNummberInArray();
	
		System.out.println(ma.getMissingNo(arry3));
		//System.out.println(ma.getMissingNo(arry2));
		//System.out.println(ma.getMissingNo(arry3));
		//System.out.println(ma.getMissingNo(arry5));
		
	}
	public int getMissingNo (int arry[]){    
		int n = arry.length;
		int total;
		total = arry[0]*(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			total = total - arry[i];
		}
		return total;	
	}
	
	int getMissingNoXor(int a[])
	{ 
		// Not recommended this is just for knowledge...
		int i, n = a.length;    
		int x1 = a[0]; /* For xor of all the elemets in arary */    
		int x2 = 1; /* For xor of all the elemets from 1 to n+1 */         
		for (i = 1; i< n; i++)        
			x1 = x1^a[i];                
		for ( i = 2; i <= n+1; i++)        
			x2 = x2^i;                 
		return (x1^x2);
	}
	

}

