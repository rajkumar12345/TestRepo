/**
 * 
 */
package com.lodhagroup;

import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * @author Rajkumar.Teckraft
 *
 */
public class DBConnectionTest {

	/**
	 * 
	 */
	public DBConnectionTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		java.sql.Connection conn=null;
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		 try {
			
			conn = DriverManager.getConnection("url", "user", "password");
			System.out.println("Connection..is."+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
