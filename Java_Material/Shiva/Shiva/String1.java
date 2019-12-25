package com.String;

public class String1 {

	public static void main(String[] args) {
		String s = "asd*&137jh";
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length - 1; i++) {
			boolean isalpha = true;
			for (int j = 97; j <= 122; j++) {
				if (j == s.charAt(i)) {
					isalpha = false;
					break;
				}
			}
			if (isalpha)
				sb.append(ch[i]);
		}
		System.out.println(sb);
	}

}
