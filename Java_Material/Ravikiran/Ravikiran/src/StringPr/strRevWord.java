package StringPr;

public class strRevWord {
  public static void main(String arg[]){
	  String str = "hello world";  
	  strRevWord sr = new strRevWord();
	  System.out.println(str + " "+ sr.reverseWordByWord(str));
  }
  
  public void RevWord(String param){

		String[] words = param.split(" ");		
		String reverse = "";

		for (int i = 0; i < words.length; i++) {
          for (int j = words[i].length() - 1; j >= 0; j--) {
              reverse += words[i].charAt(j);
          }
          System.out.print(reverse + " ");
          reverse = "";
      }

	}
  
  public String reverseWordByWord(String str){
      int strLeng = str.length()-1;
      String reverse = "", temp = "";

      for(int i = 0; i <= strLeng; i++){
          temp += str.charAt(i);
          if((str.charAt(i) == ' ') || (i == strLeng)){
              for(int j = temp.length()-1; j >= 0; j--){
                  reverse += temp.charAt(j);
                  if((j == 0) && (i != strLeng))
                      reverse += " ";
              }
              temp = "";
          }
      }
      return reverse;
  }
}
