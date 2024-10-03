package Password;


import java.security.SecureRandom;


public class Password {
	
	 Password(){		 
		 
	 } 
	 
	 
	 public static int numbers() {
		 
		 int number =0;
		 
		 int  random_num =0;
		 
		 SecureRandom  random_number  = new SecureRandom(); 
		
		 number=random_number.nextInt(0,9);	
			  
			 random_num = number;
			 
		
		 	  
		  return random_num;
	 }
	 
	public static char symbols() {
		
		 int symbols =0;
		 char symbols_name = '*';
		
		 SecureRandom  random_symbol  = new SecureRandom(); 
		
		 symbols =random_symbol.nextInt(35,38);  
			  
			 symbols_name =(char)symbols  ;
			  
		 
		   return symbols_name ;
	}
	
	
	public static char  uppercase() {
		
		int upper =0;
		
		char upper_case = 'A';
		
		SecureRandom  random_letter  = new SecureRandom();
		 
		upper= random_letter.nextInt(65,90);
		 
			 upper_case = (char) upper;
	    
		 return upper_case;
		
	}
	
	public static char lowercase() {
		
		int lower =0;
		
		char lower_case = 'b';
		
		SecureRandom  random_letter  = new SecureRandom();
	    lower =random_letter.nextInt(97,122);
	     
			 lower_case = (char)lower;
			 

		 
		   return lower_case;
		
	}
	
	//password vault functions
	
	//encrypt password
	
	
	
	
	    
	 
	
}
