package Password;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Password_UI {
	
 private JTextArea display;
 
 private JButton clear;
 
 private JButton create_pw;
 
 private static int  size =0;
 
private JComboBox<Integer> length; 
 

public void create_ui() {
    
	 JFrame  password = new JFrame("JPass");
	 
	 password.setLayout(new BorderLayout());
    
	 JPanel  panel = new JPanel(new GridLayout(1,3));
	     
	 create_pw = new JButton("Create Password");
	     
	 clear = new JButton("Clear");
	 
	 Integer[] lengths = {0,8,9,10,11,12}; 
	 
	 length = new JComboBox<Integer>(lengths);
	 
	 length.setSelectedItem(size); 	
	 
	 length.setToolTipText("Select the desired password length.");
	 
	 display = new JTextArea();
    
	 panel.add(create_pw ); 
	     
	 panel.add(clear);
	     
     panel.add(length);
	    
	 password.setSize(550, 300);
	     
	 password.setVisible(true);
	     
	 password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	 display.setVisible(true);
	    
	 display.setEditable(false);
	    
	 display.setBackground(Color.WHITE);
	    
	 JPanel  displaypanel = new  JPanel(new CardLayout());
	    
	 password.add(panel);
	    
	 password.add(displaypanel, BorderLayout.SOUTH);
	    
	 displaypanel.add(display);
	    
	 displaypanel.setPreferredSize(new Dimension(140,140));
	   
	 display.setPreferredSize(new Dimension (140,140));

	  }

public void button_listeners() {
     clear.addActionListener(new ActionListener() {

		   public void actionPerformed(ActionEvent e) {
			   
		   display.setText("");
		}
	     });
    
      create_pw.addActionListener(new ActionListener() {
          
		   public void actionPerformed(ActionEvent e) {
			   
			   if(length != null && length.getSelectedIndex()==0) {
				      
					 JOptionPane.showMessageDialog(null,"Select a valid option.");
					 
				 } else {
			 String password = Passwordgenerator.create_password();
			   
			   display.setText(password );
			   
			   }
		}
	     });
           
      length.addActionListener(e -> {
    	  
    	 
    		  
          size = (int) length.getSelectedItem(); 
          
    	  
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
