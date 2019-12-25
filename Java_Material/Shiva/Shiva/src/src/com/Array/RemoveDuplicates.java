package com.Array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "c", "c", "d", "d", "a", "e" };
		int incr=0;
		for(int i=0;i<s1.length-1;i++)
		{
			for (int j=1;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					incr++;
					s1[i]=null;
					break;
				}
			}
		}
		int modifiedlength=s1.length-incr;
		StringBuffer sb=new StringBuffer();
		for(int k=0;k<modifiedlength;k++)
		{
			if(s1[k]==null)
			{
				
			}else
				sb.append(s1[k]);
		}
		System.out.println(sb);
	}

}
