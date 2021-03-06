package tv.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DBUtil {
    
    private static Connection connection;
    
    private DBUtil() {}

    public static Connection getConnection() throws SQLException {
        // define connection parameters    
    	//String url = "jdbc:mysql://localhost:3306/tv_shows";
    	String url = "jdbc:mysql://localhost:3306/tv_shows?autoReconnect=true&useSSL=false"; // gets rid of error
        String username = "tv_shows_user";
        String password = "sesame";

        //get and return connection
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    
    // Shouldn't need to call this if getConnection() called within try-with-resources statement
    public static void closeConnection()  throws SQLException{
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
            	System.out.println("Error closing connection!");
                throw e;
            } finally {
                connection = null;                
            }
        }
    }
}



//package tv.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import com.mysql.jdbc.Driver;
//
//public class DBUtil {
//    
//    private static Connection connection;
//    
//    private DBUtil() {}
//
//    public static Connection getConnection() throws SQLException {
//        try {
//            // set the db url, username, and password
//            String url = "jdbc:mysql://localhost:3306/tv_shows";
//            String username = "tv_shows_user";
//            String password = "sesame";
//
//            // get and return connection
//            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
//            connection = DriverManager.getConnection(
//                    url, username, password);
//            //return connection;
//        } catch (SQLException e) {
//        	System.out.println("Error establishing connection!");
//            throw e;
//        }  
//        catch (IllegalAccessException|InstantiationException|ClassNotFoundException me) {
//        	System.err.println("exception in DBUtil...");
//        	me.printStackTrace();
//        }
//        return connection;
//        
//    }
//    
//    public static void closeConnection()  throws SQLException{
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//            	System.out.println("Error closing connection!");
//                throw e;
//            } finally {
//                connection = null;                
//            }
//        }
//    }
//}