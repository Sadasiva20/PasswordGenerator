package password;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Password_UI {
	
 private JTextField display;
 
 private JButton clear;
 
 private JButton create_pw;
 
 private static int size=0;
 
 private JComboBox<String> pass_list;
	  
public void create_ui() {
    	  
    	 JFrame  password = new JFrame("JPass");
    	 
		 JPanel  panel = new JPanel(new GridLayout(1,3));
		 
		   create_pw = new JButton("Password");
		     
		  clear = new JButton("Clear");
		  
		String[] pass_len = {"Select a value", "6", "8", "10", "12"};
		  
		  pass_list =  new JComboBox<String>(pass_len);
		  
		  
		  
		  pass_list.setSelectedIndex(size);
		     
		     display = new JTextField();
		     
		     panel.setPreferredSize(new Dimension (100 ,200));
		     
		     panel.add(create_pw); 
		     
		     panel.add(clear);
		     
		     panel.add(pass_list);
		     
		     password.add(panel);
		     
		     password.setSize(400, 250);
		     
		     password.setVisible(true);
		     
		     password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     
		    password.setResizable(false);
		    
		    display.setVisible(true);
		    
		    display.setEditable(false);
		    
		    display.setBackground(Color.WHITE);
		    
            JPanel  displaypanel = new JPanel(new CardLayout());
		    
		    password.add(panel);
		    
		    password.add(displaypanel, BorderLayout.SOUTH);
		    
		    displaypanel.add(display);
		    
		    displaypanel.setPreferredSize(new Dimension(100,110));
		    
		    display.setPreferredSize(new Dimension (100,110));
	  }

public void button_listeners() {
     clear.addActionListener(new ActionListener() {

		   public void actionPerformed(ActionEvent e) {
			   
			 display.setText("");
		}
	     });
    
      create_pw.addActionListener(new ActionListener() {
          
		   public void actionPerformed(ActionEvent e) {
			 
			   
			 String password = Passwordgenerator.create_password();
			   
			   display.setText(password );
			  
		}
	     });
          
          pass_list.addActionListener(new ActionListener() {
              
   		   public void actionPerformed(ActionEvent e) {
   	  
   	    if(pass_list.getSelectedIndex()!=0) {
   	    	
   	       int passlen= Integer.valueOf((String)pass_list.getSelectedItem());
   	       
   	       size = passlen;
   		   }
   	    }
   	    
   	     });
          
}

public static int get_passwordlen() {
	    
	   int get_size =0;
	   
	     if(size !=0) {
		   
		    get_size = size;
	  }
	   
	  return get_size;    
}

public   void set_passwordlength(int current_size) {
	  
	   size = current_size;
}

public String getPassword() {
	  
    
    return display.getText();
}

public  void setpassword(String password) {
	
    display.setText(password);
 
}

public static void main(String [] args) {
	 
	  Password_UI   pass_ui = new Password_UI();
	  
	  pass_ui.create_ui();
	  
	  pass_ui.button_listeners();
	  
	  pass_ui.setpassword(Passwordgenerator.create_password());
	 
}

}