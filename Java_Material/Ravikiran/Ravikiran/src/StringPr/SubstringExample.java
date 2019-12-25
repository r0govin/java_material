package StringPr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringExample {
	public static void main(String args[]) {
		String string, find;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings");
		string = in.nextLine();

		System.out.println("Enter the element to search");
		find = in.nextLine();

		SubstringExample se = new SubstringExample();
		se.Find(string, find);

	}

	public void Find(String str, String find) {
		int i, c, length;
		String sub;

		Map<String, Integer> hp = new HashMap<String, Integer>();

		length = str.length();

		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = str.substring(c, c + i);
				//
				if (hp.containsKey("Ram")) {
					// count++;
					hp.put(sub, hp.get(sub) + 1);
				} else {
					// count = 1;
					hp.put(sub, 1);
				}

				// if (sub.equals(find)){
				// System.out.println("The String found: " + find);
				// }
		//		System.out.println(sub);
			}
		}

		for (Map.Entry<String, Integer> h: hp.entrySet()){			
			System.out.println(h.getKey() + " " + h.getValue());						
		}
		
	}

}
