package ArraysPr;

// Find the two elements whose sum is closest to zero:

public class SumOfTwoNum {
	public static void main (String arg[])
	  {
		int arry[] = {1,2,3,4,6,9,0,-5,3};
		SumOfTwoNum sr = new SumOfTwoNum();
		System.out.println("Second Method");
		sr.secondMethod(arry);
	  }
	
	public void TowElementWithMinSum(int[] arry)
	{
		int i,j , min_sum, sum, min_i, min_j, inv_count = 0;
		int n = arry.length;
		if (n<2)
		{
			System.out.println("Invalid Input");
		}
		
		min_i = 0 ;
		min_j = 1 ;
		min_sum = arry[0] + arry[1];
		   for (i = 0; i < n-1; i ++)
		   { 
			   for (j = i +1 ; j < n; j ++ )
			     { 
				   sum = arry[i] + arry[j];   
				   if (Math.abs(min_sum)>Math.abs(sum))
				     {
					   min_sum = sum;
					   min_i = i;
					   min_j = j;
				     }
			     }
		   }
		System.out.println("The two elements are " + arry[min_i] + " and " + arry[min_j] );
	}

	public void secondMethod(int[] arr)
	{
		int snz=arr[0]+arr[1];
		int l=0,r=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum<0)
					sum=-1*sum;
				if(snz<0)
					snz=-1*snz;
				if(sum<=snz){
					snz=sum;
					l=i;
					r=j;
				}
					}
		}
		System.out.println ("elements sum that are near to zero "+ arr[l]+" "+ arr[r]);
		System.out.println ("sum near to zero" + snz);

	}
	
	
	
}
