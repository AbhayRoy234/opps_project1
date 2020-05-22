package login;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
import javax.swing.JOptionPane;


interface i1{
	void login_button(String username,String password);
}
public class Login_button  implements i1 {

	public static void main(String[] args) throws Exception   {
		
//		Stuent_database_conn myobj=new Stuent_database_conn();
//		System.out.println(myobj.is_connected());
		
		
	}
	
	 
	

 public void login_button(String username,String password) {
	 Connection con;

    int data=0;	
  
    	 
    try {
   	 
    	 Stuent_database_conn con1=new Stuent_database_conn();
    	 con =con1.is_connected();
         Statement stmt = con.createStatement(); 
	            String query = "SELECT password from student where username = \""+username+"\"";
	            stmt.executeQuery(query);
	            ResultSet rs = stmt.getResultSet();
               
	            if(username.length()==0 || password.length()==0) {
	            	JOptionPane.showMessageDialog(null," Enter the Username and Password");
	            	return ;
	            }
	            
	            
//	            while(rs.next()){
//	                String dbUsername = rs.getString("username");
	              rs.next();
	                String dbPassword = rs.getString("password");
	                System.out.println("ahay");
	                System.out.println(rs.getString("password"));

	                if(dbPassword.equals(password)){
	                	  System.out.println("OK");
	                    JOptionPane.showMessageDialog(null," Login succesfully");
	                    data=1;
	                    System.out.println(dbPassword);
//	    				break;
	                   
	                }    
//	            }
	            
	        if(data!=1) {
	        	JOptionPane.showMessageDialog(null," Enter Valid Credentials");
	        }
	            
	        } catch (Exception e1) {
	        	
//	            e1.printStackTrace();
	        	JOptionPane.showMessageDialog(null," Enter Valid Credentials");
	            
	        }

	}
}


