package login;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Connection;

public class Stuent_database_conn {

	public static void main(String[] args) throws Exception {
		Stuent_database_conn myobj=new Stuent_database_conn();
		System.out.println(myobj.is_connected());
}
	Connection is_connected() throws Exception{
		int indecator=0;
		Connection conn1 = null;
		try {
			
            Class.forName("com.mysql.jdbc.Driver");

             
             String url1 = "jdbc:mysql://localhost:3306/studentdatabase";
             String user = "root";
             String password = "3is76";
            

             conn1 = (Connection) DriverManager.getConnection(url1, user, password);
       
             if (conn1 != null) {
                 System.out.println("Connected to the database studentdatabase");
                 indecator=1;
                 return conn1;
             }             
		}
             catch (SQLException ex) {
		            System.out.println("An error occurred. Maybe user/password is invalid");
		            ex.printStackTrace();
             }
		return conn1;
		
	}
}