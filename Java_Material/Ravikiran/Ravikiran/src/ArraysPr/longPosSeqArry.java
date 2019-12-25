package ArraysPr;

//Find the longest running positive sequence in an array - 

public class longPosSeqArry {
	public static void main (String arg[])
	{
		int [] arry = {2,-3,3,4,-6,1,2,3,4,-8,4,5,6,7,8,9,-1} ;
		longPosSeqArry lp = new longPosSeqArry();
		lp.findPosSeq(arry);
	}


	
	public  void findPosSeq(int a[]) {
		int N = a.length;
		int maxIdx = -1;
		int maxLen = -1;
		int len = -1; 
		int idx = -1;;
		boolean flag = false;

		for (int i = 0; i < N; i++) 
		  {
			if (a[i] > 0) 
			   {
				if (flag == true) 
				{	
					len++;
				}
				else 
				{
					len = 1;  // new sequence
					idx = i;
					flag = true;
				}
			}
			else 
			{
				flag = false;
				if (len > maxLen)
				{
					maxLen = len;
					maxIdx = idx;
				}
			} 	
		}
		
		if (maxLen > 0) 	
			System.out.println("Length "+maxLen+", starting index "+maxIdx);
		else
			System.out.println("No positive sequence detected.") ;
		
		
		for (int j = maxIdx, k =1;  j < N  & k <= maxLen ; j ++ )
		{ 
			System.out.print(a[j] + " ");
			k++;
		}
		
	}

}
