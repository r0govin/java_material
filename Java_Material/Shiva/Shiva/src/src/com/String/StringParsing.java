package com.String;


public class StringParsing {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the String:"); String s = sc.nextLine();
		 */
		String str = "[A(a{bcde}hfgh)klmn]";
		StringBuffer sb = new StringBuffer();
		char[] inputArray = str.toCharArray();
		int length = inputArray.length;
		int i = 0;
		while (i < length) {
			char ch1 = inputArray[i];

			if (ch1 == '[' | ch1 == ']' | ch1 == '(' | ch1 == ')' | ch1 == '{'
					| ch1 == '}') {

			} else
				sb.append(ch1);
			i++;
		}
		System.out.println("After parsing the given String is: " + sb);
	}

}
