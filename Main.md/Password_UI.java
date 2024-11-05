package Password;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Password_UI {

    private JTextArea display;         // Display area for password
    private JButton clearButton;       // Clear button
    private JButton createButton;      // Create Password button
    private JSlider passwordSizeSlider; // Slider to select password size
    private JLabel sizeLabel;          // Label showing the selected password size
    private static int size = 8;       // Default password size

    public void createUI() {
        // Main frame
        JFrame frame = new JFrame("JPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(15, 15));

        // Set a light background color for a modern look
        frame.getContentPane().setBackground(new Color(245, 245, 245));

        // Header label for the title
        JLabel titleLabel = new JLabel("Password Manager", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(50, 50, 50));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Control panel for buttons and slider
        JPanel controlPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        controlPanel.setBackground(new Color(230, 240, 250));

        // Create Password Button
        createButton = new JButton("Create Password");
        createButton.setFont(new Font("Arial", Font.PLAIN, 16));
        createButton.setBackground(new Color(100, 149, 237)); // Cornflower blue
        createButton.setForeground(Color.WHITE);
        createButton.setFocusPainted(false);
        controlPanel.add(createButton);

        // Clear Button
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 16));
        clearButton.setBackground(new Color(220, 20, 60)); // Crimson
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        controlPanel.add(clearButton);

        // Password Size Slider
        passwordSizeSlider = new JSlider(5, 20, 8);
        passwordSizeSlider.setMajorTickSpacing(5);
        passwordSizeSlider.setMinorTickSpacing(1);
        passwordSizeSlider.setPaintTicks(true);
        passwordSizeSlider.setPaintLabels(true);
        passwordSizeSlider.setBackground(new Color(230, 240, 250));
        controlPanel.add(passwordSizeSlider);

        // Size Label
        sizeLabel = new JLabel("Password Size: 8", SwingConstants.CENTER);
        sizeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        sizeLabel.setForeground(new Color(50, 50, 50));
        controlPanel.add(sizeLabel);

        // Password display area with scroll
        display = new JTextArea(5, 30);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        JScrollPane scrollPane = new JScrollPane(display);

        // Adding panels to the frame
        frame.add(controlPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Add button listeners
        buttonListeners();

        // Display the frame
        frame.setVisible(true);
    }

    // Button and slider event handlers
    private void buttonListeners() {
        // Clear button functionality
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        // Create Password button functionality
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call to external PasswordGenerator class
                String password = Passwordgenerator.create_password(size);
                display.setText(password);
            }
        });

        // Slider functionality to update the size label dynamically
        passwordSizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                size = passwordSizeSlider.getValue();
                sizeLabel.setText("Password Size: " + size);
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

public static void main(String[] args) {
	
    Password_UI ui = new Password_UI();
    
    ui.createUI();
}


}
