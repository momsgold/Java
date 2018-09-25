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

public class ProductDB {
    
//    private Connection getConnection() throws SQLException {
//        String dbUrl = "jdbc:mysql://localhost:3306/prs"; // THIS ONE IS THE ONE
//        String username = "prs_user";
//        String password = "sesame";
//    
//        Connection connection = DriverManager.getConnection(dbUrl);
//        return connection;
//    }
    
    public List<Product> getAll() {
        String sql = "SELECT * FROM Product";
        List<Product> products = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int ID = rs.getInt(1);
                int vendorID = rs.getInt(2);
                String partNumber = rs.getString(3);
                String name = rs.getString(4);
                double price = rs.getDouble(5);
                String unit = rs.getString(6);
                String photoPath = rs.getString(7);
                // create a new instance of product ->
                Product p = new Product(ID, vendorID, partNumber, name, price, unit, photoPath); // constructor
                products.add(p); // add to products array list
            }
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    
    public Product get(String name) {
        String sql = "SELECT ID, Name "
                   + "FROM Product "
                   + "WHERE name = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
//            	 int ID = rs.getInt(1);
//                 int vendorID = rs.getInt(2);
//                 String partNumber = rs.getString(3);
//                 String n = rs.getString(4);
//                 double price = rs.getDouble(5);
//                 String unit = rs.getString(6);
//                 String photoPath = rs.getString(7);
                 Product p = getProductFromResultSet(rs); // replaces code that was here (what is in gPFRS)
                 // create a new instance of product ->
//               Product p = new Product(ID, vendorID, partNumber, n, price, unit, photoPath); // constructor
                rs.close();
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
//
    
    public boolean add(Product p) {
        String sql = "INSERT INTO Product (VendorID, PartNumber, Name, Price) "
                   + "VALUES (?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, p.getVendorID());
            ps.setString(2, p.getPartNumber());
            ps.setString(3, p.getName());
            ps.setDouble(4, p.getPrice());
            ps.executeUpdate();
            return true; // returns true if add is successful, false if it is not successful
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    
    public boolean delete(Product p) {
        String sql = "DELETE FROM Product WHERE ID = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, p.getID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    
    public boolean update(Product p) {
        String sql = "UPDATE Product SET Name = ? WHERE ID = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
        	ps.setInt(1, p.getID());
            ps.setString(2, p.getName());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public Product getProduct(int pid) {
    	  String sql = "SELECT * FROM Product WHERE ID = ?";
    	  Product product = null;
          try (Connection connection = DBUtil.getConnection();
               PreparedStatement ps = connection.prepareStatement(sql);) {
        	  ps.setInt(1, pid);
        	  ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  product = getProductFromResultSet(rs);
              }
          } catch (SQLException e) {
              System.err.println(e);
              return null;
          }
          return product;
    }
    
    private Product getProductFromResultSet(ResultSet rs) throws SQLException { // there was an error so we added "throws declaration"
    	 int ID = rs.getInt(1);
         int vendorID = rs.getInt(2);
         String partNumber = rs.getString(3);
         String name = rs.getString(4);
         double price = rs.getDouble(5);
         String unit = rs.getString(6);
         String photoPath = rs.getString(7);
         // create a new instance of product ->
         Product p = new Product(ID, vendorID, partNumber, name, price, unit, photoPath);
         return p;
    }
}