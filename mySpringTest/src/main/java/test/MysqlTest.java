package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlTest {

	public static  void main(String[] args){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/UserTest";
		String user = "root";
		String password = "123456";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,password);
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
				
			}else{
				System.out.println("Can not connect to the database");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
