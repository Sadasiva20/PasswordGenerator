import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Password_UI {
	
	
 private JTextArea display;
 
 private JButton clear;
 
 private JButton create_pw;
 
 private static int size=0;

 private JSlider length ;
 
 private JLabel password_len;
	  
public void create_ui() {
    	  
    	 JFrame  password = new JFrame("JPass");
		     
		 JPanel  panel = new JPanel(new GridLayout(1,3));
		     
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
			 
			   
			 String password = Passwordgenerator.create_password();
			   
			   display.setText(password );
			   
			  
		}
	     });
           
          length.addChangeListener(new ChangeListener() {

		public void stateChanged(ChangeEvent e) {
			
			 int get_num = length.getValue();
			 
			 size = get_num;
			 
			set_passwordlength(size);
			 
			 String pass_text = String.valueOf(get_num);
			 
			 password_len.setText(pass_text);
			
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
