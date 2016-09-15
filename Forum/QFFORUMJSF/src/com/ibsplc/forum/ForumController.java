/**
 * 
 */
package com.ibsplc.forum;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author P-1063
 *
 */
public class ForumController {
	
	
	

	public void saveUserDetails(ForumVo forumVo) {
		// TODO Auto-generated method stub
		
		
		getConnection().
		
	}
	
	
	private static Connection getConnection() throws Exception {
	    String driver = "oracle.jdbc.xa.client.OracleXADataSource";
	    String url = "jdbc:oracle:thin:@192.168.12.172:1521:IFLODEV";
	    String username = "IFLOFRDEV01";
	    String password = "IFLOFRDEV01";
	    Class.forName(driver);
	    return DriverManager.getConnection(url, username, password);
	  }

}
