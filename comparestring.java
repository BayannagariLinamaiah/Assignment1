
public class comparestring {

	public static void main(String[] args) {
		
		 String str1 = new String("helloNtt");
	      String str2 = new String("helloNtt");
	      
	     boolean output = str1 == str2;
	      System.out.println("Comparing with == operator : " + output);
	      
	      output = str1.equals(str2);
	      System.out.println("Comparing with equals()  : " + output);
	      str2 = str1;
	     
	      output = (str1 == str2);
	      System.out.println("Comparing with == operator : " + output);

	}

}
