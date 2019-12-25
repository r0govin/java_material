package StringPr;

public class SplitString {
	public static void main (String arg[]){

		String str = "ravi-kiran-sunder";
		int num = str.length();
		String[] strplt = new String[num];
		strplt[0] = "";
		int incr = 0;
		char del = '-';

		for (int i =0; i < str.length(); i ++){
			if (str.charAt(i)!= del){
				strplt[incr] += str.charAt(i);
			}

			if (str.charAt(i)==del){

			}
			else {incr++;
			strplt[incr] = "";
			strplt[incr] += str.charAt(i);}


		}		

		num = num- incr;				

		for (int i =0; i< strplt.length; i++){
			System.out.println(strplt[i]);
		}
	}

}
