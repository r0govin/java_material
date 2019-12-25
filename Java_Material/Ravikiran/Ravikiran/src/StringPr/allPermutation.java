package StringPr;
import java.io.IOException;

public class allPermutation {
	public static void main(String arg[]){

		String str1 = "ABC";
		allPermutation t1 = new allPermutation();
		try {
			t1.rotoate("", str1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void rotoate(String beg, String end) throws IOException
	{
		if (end.length()<=1)
		{
			System.out.println(beg+end);
		}
		else
		{
			for (int i=0;i<end.length();i++)
			{
				String n = end.substring(0,i)+end.substring(i+1);
				rotoate(beg + end.charAt(i),n);
			}
		}
	}

}
