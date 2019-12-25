package StringPr;

public class remSubString {
	public static void main(String arg[]){
		String str1 = "cray for coding";
		String str2= "cod";
		remSubString t1 = new remSubString();
		System.out.println(t1.remCode(str1, str2));

		}
		public String remCode(String s1, String s2){
			char [] arr=new char[256];
			for(int i=0;i<s2.length();i++)
			{
				arr[s2.charAt(i)]++;			
//				System.out.println(s2.charAt(i) + " " + arr[s2.charAt(i)]);
			}
			String Str =" ";
			for(int i=0;i<s1.length();i++)
			{
				if(arr[s1.charAt(i)] == 0)
				{
					Str+=s1.charAt(i);
				}
			}
			return Str;
		}
		
}
