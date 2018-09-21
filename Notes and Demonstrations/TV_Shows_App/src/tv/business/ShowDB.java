package tv.business;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import tv.util.DBUtil;

public class ShowDB implements ShowDAO {
	
//	private Connection getConnection() throws SQLException {
//	String dbUrl = "jdbc:mysql:localhost:3306/tv_shows";
//	String username = "tv_shows_user";
//	String password = "sesame";
//	Connection connection = DriverManager.getConnection(dbUrl, username, password);
//	return connection;
//	}

	@Override
	public List<Show> get(String genre) {
		String sql = "select * from tvshow where genre = ?"; // use ? as a placeholder for user input
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setString(1, genre);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String rating = rs.getString(3);
				int length = rs.getInt(4);
				String g = rs.getString(5); // use "g" or you'll get a duplicate error message
				String network = rs.getString(6);
				Show s = new Show(id, name, rating, length, g, network);
				shows.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shows; // return the array list
	}

	@Override
	public List<Show> get(int length) {
		String sql = "select * from tvshow where length = ?"; // use ? as a placeholder for user input
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setInt(1, length);
			ResultSet rs = ps.executeQuery(); // brings back a number of rows
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String rating = rs.getString(3);
				int l = rs.getInt(4);
				String genre = rs.getString(5); // use "l" or you'll get a duplicate error message
				String network = rs.getString(6);
				Show s = new Show(id, name, rating, l, genre, network);
				shows.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shows; // return the array list
	}

	@Override
	public List<Show> getAll() {
		String sql = "SELECT * FROM tvshow";
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) { // pulls the first record
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String rating = rs.getString(3);
				int length = rs.getInt(4);
				String genre = rs.getString(5);
				String network = rs.getString(6);
				Show s = new Show(id, name, rating, length, genre, network);
				shows.add(s); // add to shows array
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shows;
	}

	@Override
	public boolean add(Show s) {
		System.out.println("Not yet implemented");
		return false;
	}

	@Override
	public boolean update(Show s) {
		System.out.println("Not yet implemented");
		return false;
	}

	@Override
	public boolean delete(Show s) {
		System.out.println("Not yet implemented");
		return false;
	}

}
