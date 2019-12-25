package StringPr;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class countWords {

	public static void main (String arg[]) throws IOException{

		HashMap<String, Integer> hp = new HashMap<String,Integer>();
		

		try {
			File file = new File("C:/Users/rg833970/Desktop/word/ravi.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();

			//			System.out.println(stringBuffer);
			String str = stringBuffer.toString();
			StringTokenizer st = new StringTokenizer(str);	
			System.out.println("---- Split by space ------");

			while (st.hasMoreElements()) {
				String s= (String) st.nextElement();
				if (hp.containsKey(s))
				{								
					//count++;
					hp.put(s, hp.get(s)+1);
				}
				else 
				{
					//count = 1;
					hp.put(s, 1);				
				}		
			}

			for (Map.Entry<String, Integer> h: hp.entrySet()){			
				System.out.println(h.getKey() + " " + h.getValue());						
			}

		} 

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}