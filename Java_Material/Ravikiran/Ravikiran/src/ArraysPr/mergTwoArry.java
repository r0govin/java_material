package ArraysPr;

import java.util.Arrays;

//I need to merge this two array in third array int[] 3 = new int[1.Length + 2.Length]; 
//and give the output in sorted form. 

public class mergTwoArry {
	public static void main (String arg[]){
		int[] arry1 = {1,3,5,7,11};
		int[] arry2 = {2,4,6,8,10};
		mergTwoArry ta = new mergTwoArry();
		//ta.mergeArry(arry1, arry2);
		ta.mergeIntoSortedArray(arry1, arry2);
		
	}
	
    public void mergeIntoSortedArray(int[] arr1, int[] arr2) {
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
        int[] out = new int[arr1.length + arr2.length];
        int j = 0;
        int k = 0;
        int i = 0;
        while (j < arr1.length && k < arr2.length) {
            if (arr1[j] < arr2[k]) {
                out[i++] = arr1[j++];
            } else {
                out[i++] = arr2[k++];
            }
        }
        while (j < arr1.length) {
            out[i++] = arr1[j++];
        }

        while (k < arr2.length) {
            out[i++] = arr2[k++];
        }

        for (int p = 0 ; p < out.length ; p++){
    		System.out.print(out[p] + " ");
    		}
    }
	
	public void mergeArry (int[] arry1, int[] arry2)
	{
		int [] arry3 = new int[arry1.length+arry2.length];
		int k = 0;
		for (int i = 0 ; i < arry1.length; i ++){
			arry3[k++] = arry1[i];
		}
		
		for (int j = 0 ; j < arry2.length; j ++){
			arry3[k++] = arry2[j];
		}
		
		Arrays.sort(arry3);
		
		for (int p = 0 ; p < arry3.length ; p++){
		System.out.print(arry3[p] + " ");
		}
	}

}
