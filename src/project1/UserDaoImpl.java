package project1;

import java.sql.Connection;
import java.sql.DriverManager;
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
			
			String sql = "SELECT title, author, publisher, rate FROM books";
			rs = stmt.executeQuery(sql);
			
			//	각 레코드를 List<UserVo>로 변환
			while (rs.next()) {
				String title = rs.getString(1);
				String authorName = rs.getString(2);
				String publisher = rs.getString(3);
				Integer rate = rs.getInt(4);
				
				UserVo vo = new UserVo(title, authorName, publisher, rate);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public List<UserVo> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(UserVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
