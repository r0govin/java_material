package ArraysPr;

public class MissingtwoNumArr {
	
	public static void main (String arg[]){
		int[] arry = {1,2,3,4,6,7,9,10};
		MissingtwoNumArr mtr = new MissingtwoNumArr();
		mtr.findtwoNum(arry);
		
	}
	
	public void findtwoNum(int[] arry){
		int n = arry.length + 2;
		int orlen = arry.length;
		
		int expectedSum = (n * (n + 1)) / 2;
		int expectedSquaredSum = (n * (n + 1) * (2 * n + 1)) / 6;
		
		int sum = 0;
		int squaredSum = 0;
		for (int i =0 ; i < orlen ; i ++)
		{
			sum+=arry[i];
			squaredSum+=arry[i]*arry[i];
		}
		System.out.println("sum=" + sum);
		System.out.println("squared sum=" + squaredSum);
		
		int xplusy = expectedSum - sum;
		int xsquareplusysquare = expectedSquaredSum - squaredSum;
		
		int twoxy = xplusy * xplusy - xsquareplusysquare;
		int xminusy = (int) Math.sqrt(xsquareplusysquare - twoxy);
		

		int x = (xplusy - xminusy) / 2;
		int y = (xplusy + xminusy) / 2;
		
		System.out.println("Missing number: " +x + "  " +y );
	}

}
