
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Passwordgenerator {
	
	  public JFrame password;
	  
	  private JButton create_pw ;
	  
	  private JButton clear ;
	  
	  private JSlider length;
	  
	  private JLabel password_len;
	  
	  private JTextArea display;
	  
	  private JPanel panel ;
	  
	  public int size =0;
	  
      public Passwordgenerator() {
    	  
    	     password = new JFrame("JPass");
		     
		     panel = new JPanel(new GridLayout(1,3));
		     
		     create_pw = new JButton("Create Password");
		     
		     clear = new JButton("Clear");
		  
		     length = new JSlider(JSlider.HORIZONTAL,0,12,8);
		    
		     length.setValue(0);
		     		     
		     length.setToolTipText("Drag the slider to select the password length.");
		    
		     password_len = new JLabel();
		     
		     int get_value = length.getValue();
		     
		     String set_value =  String.valueOf(get_value);
		     
		     password_len.setText(set_value);
		     
		     password_len.setVerticalAlignment(JLabel.BOTTOM);
		     
		     display = new JTextArea();
            
		     panel.add(create_pw ); 
		     
		     panel.add(clear);
		     
             panel.add(length);
             
             panel.add(password_len);
		     
		     panel.setSize(400, 400);
		     
		     password.setSize(550, 300);
		     
		     password.setVisible(true);
		     
		     password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
		   
	  public void create_display() {
		   
		    
		    display.setVisible(true);
		    
		    display.setEditable(false);
		    
		    display.setBackground(Color.WHITE);
		    
		    JPanel  displaypanel = new  JPanel(new CardLayout());
		    
		    password.add(panel);
		    
		    password.add(displaypanel, BorderLayout.SOUTH);
		    
		    displaypanel.add(display);
		    
		    displaypanel.setPreferredSize(new Dimension(200,150));
		    
		   
		    display.setPreferredSize(new Dimension (200,150));
		     
	  }
	  public void button_listeners() {
	       clear.addActionListener(new ActionListener() {

			   public void actionPerformed(ActionEvent e) {
				   
				 display.setText("");
			}
		     });
	  
	        create_pw.addActionListener(new ActionListener() {

			   public void actionPerformed(ActionEvent e) {
				  if(size ==0) {
                   current_length(size);
				  }
				   create_password();
				   
				   display.setText(getPassword());
				   
				  
			}
		     });
                 
                length.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent e) {
				
				 int get_num = length.getValue();
				 
				 size = get_num;
				 
				 String pass_text = String.valueOf(get_num);
				 
				 password_len.setText(pass_text);
				
			}
		     });
                
	  }
	  public void create_password() {
		  
		      
		    SecureRandom  random_num  = new SecureRandom();
		    
		    SecureRandom random_character = new SecureRandom();

		    int num =  random_num.nextInt(0,9);
		    
		    String number = "";
		    
		    StringBuilder new_password = new StringBuilder();
		    	
		    StringBuilder password = new StringBuilder();
		  
		    String password_2 = "";
		    
		   
		    char  all_characters= 0;
		
		    password.setLength(size);
		   
		  
		   
		   char symbols[] =  {'#','!','%','$' ,'^'};
		   
		   new_password.append(symbols);
			   
			new_password.append(num);
			       
		        
		   
		    for(int counter=0; counter < size ; counter++) {
		    	  char upper_case = (char) random_num.nextInt(65,90);
				    
				   char  lower_case = (char) random_num.nextInt(97,122);
				   
				   
				   new_password.append(upper_case);
				   
				   new_password.append(lower_case);
		    
		    	  all_characters = new_password.charAt(random_character.nextInt(new_password.length()));
		     
				 password.append(all_characters);
				 
		    	 password_2 = password.toString();
		    	 
		    	 remove_duplicates(password_2);
				   
				 setpassword( "  " +password_2);
		    
		    }
		    
		  	  }
	  
	  private void remove_duplicates(String password) {
	    	  
		        Set  password_list = new HashSet();
		        
		        password_list.add(password);
	    	
	    	
	    }
	  private void current_length(int pass_len) {
		  
		  
		           
		          
			  
			    
					   
					     
				   }
			    
				
			   
			   
		   
	  
	 

  public static void main(String [] args) {
	  
	  Passwordgenerator pass = new Passwordgenerator();
	  
	  pass.create_display();
	  
	  pass.button_listeners();
	  
	  
  }
  
  public String getPassword() {
	  
	     
	     return display.getText();
  }
  public void setpassword(String password) {
	  
	     display.setText(password);
	  
  }
	
}

	


