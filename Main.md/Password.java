package password;

import java.security.SecureRandom;

public class Password {
	
	 public static int numbers() {
		 
		 int  random_num =0;
		 
		 SecureRandom  random_number  = new SecureRandom();
		 
		
		 for(int number=0; number <= random_number.nextInt(0,9);number++) {
			
			  
			 random_num = number;
			 
		 }
		 
		  
		  return random_num;
	 }
	 
	public static char symbols() {
		
		
		 char symbols_name = '*';
		 
 
		
		 SecureRandom  random_symbol  = new SecureRandom();
		 
		
		 
		 for(int symbols =0 ; symbols <=random_symbol.nextInt(35,38);  symbols++) {
		    
	         
			  
			 symbols_name =(char)symbols  ;
			  
		 }
		 
		   return symbols_name ;
	}
	
	
	public static char  uppercase() {
		
		char upper_case = 'A';
		
		SecureRandom  random_letter  = new SecureRandom();
		 
		for(int upper=0;  upper <= random_letter.nextInt(65,90);upper++) {
			 
			 upper_case = (char) upper;
		} 
		
		 return upper_case;
		
	}
	
	public static char lowercase() {
		
		char lower_case = 'b';
		
		SecureRandom  random_letter  = new SecureRandom();
		for( int lower =0;  lower<= random_letter.nextInt(97,122); lower++) {
	    
			 
			 lower_case = (char)lower;	
		}
		 
		   return lower_case;
		
	}
	
	public static String remove_duplicates(StringBuilder string_name) {
		
		   
		    for(int count =0; count<string_name.length(); count++) {
		    	
		    	
		      for(int counter = 0;  counter < count; counter++) {   	 
		    	   
		    	   
		    	   if(string_name.charAt(count)==string_name.charAt(counter)) {
		    		   
			    		 
			    		 string_name.deleteCharAt(count);  
		    	   
		    }
		      }
		    	 
		    	 }
		         
		      return string_name.toString();
		
		      }
	
}
