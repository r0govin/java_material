package ArraysPr;

import java.util.Arrays;

public class removDupChOptWay {
	public static void main (String arg[]){

		char [] ch = {'a','b','c','d','e','f','g','h','i',
				'b','b','b','b','b','b','b','b',
				'c','c','c','c','c','c','c','c','c',
				'd','d','d','d','d','d','d','d','d','d','d','d'};

		int [] num = {1,1,1,2,2,3,3,4,5,6};		

		removDupChOptWay rm = new removDupChOptWay();
		//rm.removeDuplicates(ch);
		//rm.removeDuplicates(num);
		rm.removeTrail(num);

	}

	public void removeTrail(int[] array)
	{
		int Length = array.length;
		int i, j;

		/* new length of modified array */
		int NewLength = 1;

		for(i=0; i< Length; i++){
			for(j=0; j< NewLength ; j++)
			{
				if(array[i] == array[j])
					break;
			}

			/* if none of the values in index[0..j] of array is not same as array[i],
		      then copy the current value to corresponding new position in array */

			if (j==NewLength )
				array[NewLength++] = array[i];
		}
		array = Arrays.copyOfRange(array, 0, NewLength) ;
		for (int p = 0 ; p < array.length; p ++)
		{
			System.out.print(array[p] + " ");
		}	

	}

	private void removeDuplicates(int[] data){
		boolean[] entries = null;
		if (data == null || data.length < 2) {
			System.out.println("data is null");
		}

		entries = new boolean[255];
		int tail = 1;
		for (int head = 1; head < data.length ; ++head){
			if (data[head] == data[tail] || entries[data[head]]) {
				continue;
			}
			data[++tail] = data[head];
			entries[data[head]] = true;
		}
		data =  Arrays.copyOfRange(data , 0 , tail);

		for (int i = 0 ; i < data.length; i ++)
		{
			System.out.print(data[i] + " ");
		}
	}

}
