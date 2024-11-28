package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

	static final String dburl = "jdbc:mysql://localhost:3306/library_db";
	static final String dbuser = "library_user";
	static final String dbpass = "1234";

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		return conn;
	}

	@Override
	public List<UserVo> getList() {
		List<UserVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT books.title, authors.author_name, publishers.publisher_name, pub_date, rate, Locations_id, types.type_name \r\n"
					+ "FROM books JOIN authors ON books.author_id = authors.author_id\r\n"
					+ "			JOIN types ON books.type_id = types.type_id\r\n"
					+ "			JOIN publishers ON books.publisher_id = publishers.publisher_id\r\n"
					+ "WHERE authors.author_name LIKE ";
			rs = stmt.executeQuery(sql);

			// 각 레코드를 List<UserVo>로 변환
			while (rs.next()) {
				String title = rs.getString(1);
				String authorName = rs.getString(2);
				String publisher = rs.getString(3);
				String pubdate = rs.getString(4);
				Integer rate = rs.getInt(5);
				Integer locationId = rs.getInt(6);
				String type = rs.getString(7);

				UserVo vo = new UserVo(title, authorName, publisher, pubdate, rate, locationId, type);

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<UserVo> search(String name_id, String password) {
		List<UserVo> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			String sql = "SELECT name_id, password FROM customers WHERE name_id LIKE ? AND password LIKE ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name_id);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				if (rs.getString(1).equals(name_id) & rs.getString(2).equals(password)) {
					System.out.println("로그인 성공 !");
					UserVo vo = new UserVo(rs.getString(1), rs.getString(2));
					list.add(vo);
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}

	@Override
	public List<UserVo> search2(String author_name) {
		List<UserVo> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT books.title, authors.author_name, publishers.publisher_name, pub_date, rate, Locations_id, types.type_name \r\n"
					+ "FROM books JOIN authors ON books.author_id = authors.author_id\r\n"
					+ "			JOIN types ON books.type_id = types.type_id\r\n"
					+ "			JOIN publishers ON books.publisher_id = publishers.publisher_id\r\n"
					+ "WHERE authors.author_name LIKE ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, author_name);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				if (rs.getString(2).equals(author_name)) {

					UserVo vo = new UserVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getInt(6), rs.getString(7));
					list.add(vo);
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return list;
	}

	@Override
	public List<UserVo> search3(String title) {
		List<UserVo> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT books.title, authors.author_name, publishers.publisher_name, pub_date, rate, Locations_id, types.type_name\r\n"
					+ "FROM books JOIN authors ON books.author_id = authors.author_id\r\n"
					+ "			JOIN types ON books.type_id = types.type_id\r\n"
					+ "			JOIN publishers ON books.publisher_id = publishers.publisher_id\r\n"
					+ "WHERE books.title LIKE ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				if (rs.getString(1).equals(title)) {

					UserVo vo = new UserVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getInt(6), rs.getString(7));
					list.add(vo);
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return list;
	}

	@Override
	public List<UserVo> search4(String publisher) {
		List<UserVo> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT books.title, authors.author_name, publishers.publisher_name, pub_date, rate, Locations_id, types.type_name\r\n"
					+ "FROM books JOIN authors ON books.author_id = authors.author_id\r\n"
					+ "			JOIN types ON books.type_id = types.type_id\r\n"
					+ "			JOIN publishers ON books.publisher_id = publishers.publisher_id\r\n"
					+ "WHERE publishers.publisher_name LIKE ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, publisher);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				if (rs.getString(3).equals(publisher)) {

					UserVo vo = new UserVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getInt(6), rs.getString(7));
					list.add(vo);
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return list;
	}

	@Override
	public List<UserVo> search5(String type) {
		List<UserVo> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT books.title, authors.author_name, publishers.publisher_name, pub_date, rate, Locations_id, types.type_name\r\n"
					+ "FROM books JOIN authors ON books.author_id = authors.author_id\r\n"
					+ "			JOIN types ON books.type_id = types.type_id\r\n"
					+ "			JOIN publishers ON books.publisher_id = publishers.publisher_id\r\n"
					+ "WHERE types.type_name LIKE ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, type);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				if (rs.getString(7).equals(type)) {

					UserVo vo = new UserVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getInt(6), rs.getString(7));
					list.add(vo);
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return list;
	}

	@Override
	public boolean insert(UserVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;

		try {
			conn = getConnection();
			String sql = "INSERT INTO Customers (name, email, phone_number, birth_date, name_id, password) VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

//			(name, email, phone_number, birth_date, name_id, password)

			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getPhone_number());
			pstmt.setString(4, vo.getBirth_date());
			pstmt.setString(5, vo.getName_id());
			pstmt.setString(6, vo.getPassword());

			insertedCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 1 == insertedCount;
	}

	
	
	@Override
	public boolean update(UserVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserVo> getListC() {
		// TODO Auto-generated method stub
		return null;
	}

}
