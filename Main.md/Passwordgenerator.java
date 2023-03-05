







public class Passwordgenerator {
	
	  
	
	  
	 private static int size = 0;
	 
	  
	
      public Passwordgenerator() {
    	  
	  }
	   

      public static  String create_password() {
    	  
    	    
    	    StringBuilder pass = new StringBuilder();
    	  
    	    String password = "";
    	    
    	    size = Password_UI.get_passwordlen();
    	    
    	   while(pass.length() <size) {
    	    
    	         pass.append(Password.uppercase());
	    	 
		         pass.append(Password.lowercase());
		    	 
		         pass.append(Password.numbers());
		    	 
		         pass.append(Password.symbols());
	    	     
		        
    	   }
    	    
    	   pass.setLength(size);
    	   
    	   
    	   password = pass.toString();
    	   
    	 
    	  
    	    
    	       return password;
    	  	  }

	  
	    
}

	


