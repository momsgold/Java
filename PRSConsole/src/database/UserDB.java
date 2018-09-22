package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import business.DAO;
//import business.Product;
import business.User;

public class UserDB {
	private Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/prs?autoReconnect=true&useSSL=false";
        Connection connection = DriverManager.getConnection(dbUrl);
        return connection;
    }
    
//  @Override
    public List<User> getAll() {
        String sql = "SELECT ID, UserName, Password, FirstName, LastName " +
        			 "PhoneNumber, Email, isReviewer, isAdmin "
                   + "FROM Products ORDER BY ID ASC";
        List<User> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String userName = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("First Name");
                String lastName = rs.getString("Last name");
                String phoneNumber = rs.getString("Phone number");
                String email = rs.getString("Email");
                boolean isReviewer = rs.getBoolean("Reviewer");
                boolean isAdmin = rs.getBoolean("Admin");

                User u = new User (ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
                user.add(u);
            }
            return user;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

//  @Override
    public User get(String userName) {
        String sql = "SELECT ID, UserName "
                   + "FROM Products "
                   + "WHERE UserName = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                User u = new User(userName);
                rs.close();
                return u;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

//  @Override
    public boolean add(User u) {
        String sql = "INSERT INTO Products (ID, UserName) "
                   + "VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, u.getID());
            ps.setString(2, u.getUserName());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

//  @Override
    public boolean delete(User u) {
        String sql = "DELETE FROM Products "
                   + "WHERE UserName = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, u.getUserName());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

//  @Override
    public boolean update(User u) {
        String sql = "UPDATE Products SET "
                   + "  UserName = ?, "
                   + "  PassWord = ? "
                   + " 	Email    = ? "
                   + "WHERE UserName = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getEmail());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
