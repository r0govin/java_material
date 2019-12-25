package StringPr;

public class countNumbOccur {

	public static void main (String arg[])
	{
		String param = "Ravikiran Govindareddy";
		System.out.println("The String is " + param+ " The Count " + countOcc(param));
	}
	
	public static int countOcc(String param)
	{
		int count=0;
		char ch[] = param.toCharArray();
		for (int i = 0; i < ch.length ; i++)
		{
			if (ch[i]=='i')
			{
				count++;
			}
		}
		
		return  count;
	}
	
}
