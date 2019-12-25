package ArraysPr;
import java.util.*;
public class removeDuplicate {

	public static  void main (String arg[]){

		int[] arry = {1,1,2,2,7,7};	
		char ch[] = {'a','a','c','c','d','d'};
		removeDuplicate r = new removeDuplicate();
	    System.out.println(r.finddupArry(ch));;
	//	r.finddupHash(arry);

	}

	public Object[] finddupHash(int[] arry){
		Set<Integer> s=new HashSet<Integer>();
		System.out.println("Hashing technique");
		for(int i=0;i<arry.length;i++)
		{
			if(!s.contains(arry[i]))
			{s.add(arry[i]);}
		}
		for(Integer i:s)
		{
			
			System.out.println(i);
		}
		
		return s.toArray();
	}

	public char[] finddupArry(char[] arry){
		int count =0;
		int incr=0;	
		System.out.println("Array technique");
		for (int i =0; i < arry.length-1; i++){
			if (arry[i]==arry[i+1]){
				count++;
			}
		}

		char [] newarry = new char[arry.length];
		for (int i =0;i< arry.length-1; i ++){
			if (arry[i]==arry[i+1]){	
				newarry[incr]= arry[i];
	//			System.out.print(" "+newarry[incr]);
				incr++;				
			}
		}
		return newarry;
	}
}
