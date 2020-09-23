
public class compareobject {

	public static void main(String[] args) {
		
		        String s1 = new String("Nikhil"); 
		        String s2 =new String("linga"); 
		        String s3 =new String ("kishore"); 
		        String s4 =new String("linga"); 
		  
		        
		        System.out.println(s1 + " == " + s2 
		                         + ": " + (s1 == s2)); 
		        
		        System.out.println(s1 + " .equals " + s2 
						+ ": " + s1.equals(s2)); 
		        
		        System.out.println(s2 + " == " + s4 
                        + ": " + (s2 == s4)); 
		        
		        System.out.println(s2 + " .equals " + s4 
						+ ": " + s2.equals(s4)); 
		  
		       
		        System.out.println(s2 + " == " + s3 
		                         + ": " + (s2 == s3)); 
		        
		        System.out.println(s2 + " .equals " + s3 
						+ ": " + s2.equals(s3)); 
		  
		       
		        System.out.println(s1 + " == " + s4 
		                         + ": " + (s1 == s4)); 
		        
		        System.out.println(s1 + " .equals " + s4 
						+ ": " + s1.equals(s4)); 
		    } 
		
	}


