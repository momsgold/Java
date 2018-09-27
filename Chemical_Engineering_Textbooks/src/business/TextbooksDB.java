package business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

public class TextbooksDB {
    public List<Textbooks> getAll() {
        String sql = "SELECT * FROM books ORDER BY ID ASC";
        List<Textbooks> textbooks = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int ID = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);

                // create a new instance of product ->
                Textbooks t = new Textbooks(ID, title, author); // constructor
                textbooks.add(t); // add to products array list
            }
            return textbooks;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
    
    public Textbooks get(String title) {
        String sql = "SELECT ID, Title "
                   + "FROM books "
                   + "WHERE Title = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, title);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 Textbooks t = getTextbookFromResultSet(rs); // replaces code that was here (what is in gPFRS)
                rs.close();
                return t;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }
 
    
    public List<Integer> getIdNumbers() {
        String sql = "SELECT ID FROM books ";
        List<Integer> ids = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 int i = rs.getInt(1); // replaces code that was here (what is in gPFRS)
                ids.add(new Integer(i));
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
        return ids;
    }
    
    
    public boolean add(Textbooks t) {
        String sql = "INSERT INTO books (Title, Author) "
                   + "VALUES (?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, t.getTitle());
            ps.setString(2, t.getAuthor());
            ps.executeUpdate();
            return true; // returns true if add is successful, false if it is not successful
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean update(Textbooks t) {
        String sql = "UPDATE books SET Title = ?, Author = ? WHERE ID = ?";//"UPDATE books SET Title = ? WHERE ID = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
        	ps.setString(1, t.getTitle());
        	ps.setString(2, t.getAuthor());
        	ps.setInt(3, t.getID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean delete(Textbooks t) {
        String sql = "DELETE FROM books WHERE ID = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, t.getID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    
    private Textbooks getTextbookFromResultSet(ResultSet rs) throws SQLException { // there was an error so we added "throws declaration"
   	 	int ID = rs.getInt(1);
        String title = rs.getString(2);
        String author = rs.getString(3);
        // create a new instance of product ->
        Textbooks t = new Textbooks(ID, title, author);
        return t;
   }
    
    public Textbooks getTextbooks(int tid) {
  	  String sql = "SELECT * FROM books WHERE ID = ?";
  	  Textbooks textbooks = null;
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);) {
      	  ps.setInt(1, tid);
      	  ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textbooks = getTextbookFromResultSet(rs);
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
        return textbooks;
  }
    
}
