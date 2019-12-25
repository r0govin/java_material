package ArraysPr;

public class MinArry {
	public static void main (String arg[])
	  {
		int arry[] = {-1,4,5,-23,24};
		MinArry ar = new MinArry();
		ar.Minarry(arry);
	  }
	
	public int  Minarry(int[] arry)
	   {
		int min = arry[0];
		for (int i = 0; i < arry.length ; i++)
		{
			if(arry[i]<min)
				min=arry[i];
		}
		System.out.println("minimum element in array is " + min);
		return min;
	   }
	
}
