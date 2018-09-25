package business;

import business.Product;
import util.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDB {
    
//    private Connection getConnection() throws SQLException {
//    	 String dbUrl = "jdbc:mysql://localhost:3306/prs"; // THIS ONE IS THE ONE
//         String username = "prs_user";
//         String password = "sesame";
//         
//        Connection connection = DriverManager.getConnection(dbUrl);
//        return connection;
//    }
    
   
    public List<User> getAll() {
        String sql = "SELECT * FROM User";
        List<User> users = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int ID = rs.getInt(1);
                String userName = rs.getString(2);
                String password = rs.getString(3);
                String firstName = rs.getString(4);
                String lastName = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String email = rs.getString(7);
                boolean isReviewer = rs.getBoolean(8);
                boolean isAdmin = rs.getBoolean(9);

                User u = new User(ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
                users.add(u);
            }
            return users;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    
//    public User get(String code) {
//        String sql = "SELECT ProductCode, Description, Price "
//                   + "FROM Products "
//                   + "WHERE ProductCode = ?";
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, code);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                String description = rs.getString("Description");
//                double price = rs.getDouble("Price");
//                User u = new User(code, description, price);
//                rs.close();
//                return u;
//            } else {
//                rs.close();
//                return null;
//            }
//        } catch (SQLException e) {
//            System.err.println(e);
//            return null;
//        }
//    }
//
//    
//    public boolean add(User u) {
//        String sql = "INSERT INTO Products (ProductCode, Description, Price) "
//                   + "VALUES (?, ?, ?)";
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, u.getCode());
//            ps.setString(2, u.getDescription());
//            ps.setDouble(3, u.getPrice());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
//
//    
//    public boolean delete(User u) {
//        String sql = "DELETE FROM Products "
//                   + "WHERE ProductCode = ?";
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, u.getCode());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
//
//    
//    public boolean update(Product p) {
//        String sql = "UPDATE Products SET "
//                   + "  Description = ?, "
//                   + "  Price = ? "
//                   + "WHERE ProductCode = ?";
//        try (Connection connection = DBUtil.getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, p.getDescription());
//            ps.setDouble(2, p.getPrice());
//            ps.setString(3, p.getCode());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
}




//package business;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDB {
//	private Connection getConnection() throws SQLException {
//        String dbUrl = "jdbc:mysql://localhost:3306/prs?autoReconnect=true&useSSL=false";
//        Connection connection = DriverManager.getConnection(dbUrl);
//        return connection;
//    }
//    
////  @Override
//    public List<User> getAll() {
//        String sql = "SELECT ID, UserName, Password, FirstName, LastName " +
//        			 "PhoneNumber, Email, isReviewer, isAdmin "
//                   + "FROM Products ORDER BY ID ASC";
//        List<User> products = new ArrayList<>();
//        try (Connection connection = getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery()) {
//            while (rs.next()) {
//                int id = rs.getInt("ID");
//                String userName = rs.getString("Username");
//                String password = rs.getString("Password");
//                String firstName = rs.getString("First Name");
//                String lastName = rs.getString("Last name");
//                String phoneNumber = rs.getString("Phone number");
//                String email = rs.getString("Email");
//                boolean isReviewer = rs.getBoolean("Reviewer");
//                boolean isAdmin = rs.getBoolean("Admin");
//
//                User u = new User (ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
//                user.add(u);
//            }
//            return user;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return null;
//        }
//    }
//
////  @Override
//    public User get(String userName) {
//        String sql = "SELECT ID, UserName "
//                   + "FROM Products "
//                   + "WHERE UserName = ?";
//        try (Connection connection = getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, userName);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                int ID = rs.getInt("ID");
//                String un= rs.getString("user name");
//                User u = new User(un);
//                rs.close();
//                return u;
//            } else {
//                rs.close();
//                return null;
//            }
//        } catch (SQLException e) {
//            System.err.println(e);
//            return null;
//        }
//    }
//
////  @Override
//    public boolean add(User u) {
//        String sql = "INSERT INTO Products (ID, UserName) "
//                   + "VALUES (?, ?)";
//        try (Connection connection = getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setInt(1, u.getID());
//            ps.setString(2, u.getUserName());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
//
////  @Override
//    public boolean delete(User u) {
//        String sql = "DELETE FROM Products "
//                   + "WHERE UserName = ?";
//        try (Connection connection = getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, u.getUserName());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
//
////  @Override
//    public boolean update(User u) {
//        String sql = "UPDATE Products SET "
//                   + "  UserName = ?, "
//                   + "  PassWord = ? "
//                   + " 	Email    = ? "
//                   + "WHERE UserName = ?";
//        try (Connection connection = getConnection();
//             PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setString(1, u.getUserName());
//            ps.setString(2, u.getPassword());
//            ps.setString(3, u.getEmail());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        }
//    }
//}
