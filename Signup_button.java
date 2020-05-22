package login;
import java.sql.*;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;


interface i2{
	void signup_button(String username,String password);
}
public class Signup_button implements i2{

	public static void main(String[] args) {
		

	}
	 public void signup_button(String username,String password) {
		 Connection con;
		
	    int data=0;	
	  
	    	 
	    try {
	   	 
	    	 Stuent_database_conn con1=new Stuent_database_conn();
	    	 con =con1.is_connected();
	         Statement stmt = con.createStatement();     
	            // Inserting data in database 
	            String q1 = "insert into student values('" +username+ "', '" +password+ "')"; 
                int x = stmt.executeUpdate(q1); 
	            if(username.length()==0 || password.length()==0) {
		        	JOptionPane.showMessageDialog(null, "Enter the Username and Password");
	        	
		        }
	            else if (x > 0)             
             JOptionPane.showMessageDialog(null, "You have registerd succesfully");             
	            else            
	                System.out.println("Not registerd"); 
	              
	            con.close(); 
	        } 
	        catch(Exception e1) 
	        { 
     	JOptionPane.showMessageDialog(null, "This username already registered"); 
	        } 

		}
}

