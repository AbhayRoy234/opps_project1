package login;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Checkbox;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Stencil", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblNewLabel.setBounds(113, 22, 267, 27);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(189, 82, 139, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 151, 139, 27);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		passwordField.setEchoChar('*');
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(34, 82, 125, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(45, 138, 162, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton.setBounds(34, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SignUp");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String id = textField.getText(); 
				 
				 String pass = new String(passwordField.getPassword()); 
				 EncryptExample myobj=new EncryptExample();
			    	String password=myobj.EncryptExample_function(pass);
			    	
			        Signup_button myob=new Signup_button();
			        myob.signup_button(id,password);
			        textField.setText("");
			        passwordField.setText("");
			}
		});
		
		btnNewButton_1.setBounds(164, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e)  {
//				int data=0;
				 String id = textField.getText(); 
 
				 String pass = new String(passwordField.getPassword());  

				 EncryptExample myobj=new EncryptExample();
			    	String password=myobj.EncryptExample_function(pass);
			        Login_button myob=new Login_button();
			        myob.login_button(id,password);
			        textField.setText("");
			        passwordField.setText("");
			}
				 		
		});
		btnNewButton_2.setBounds(312, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
