package study.db.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleMain {

	public static void main(String[] args) {
		selectDept();
		
		findProduct();
		
		
	}
	
		public static void findProduct() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			// DB 연결 정보
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "scott";
			String db_pw = "tiger";

			Connection conn = null; // DB 연결
			PreparedStatement psmt = null;
			ResultSet rs = null; // SQL 실행 Select 결과 저장하는 객체

			// DB 연결
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 쿼리 준비
			String sqlQuery = "select * from product";
			try {
				// 쿼리 실행 후 데이터 후속 처리
				psmt = conn.prepareStatement(sqlQuery);
				rs = psmt.executeQuery();

				while (rs.next()) { // 다음 읽어올 데이터가 있는가? True 데이터가 있다
					System.out.println("Product ID: " + rs.getInt("P_CODE"));
					System.out.println("Product Name: " + rs.getString("P_NAME"));
					System.out.println("Product Price: " + rs.getDouble("P_PRICE"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			// DB 연결 종료
			try {
				if (rs != null) {
					rs.close();
				}

				if (psmt != null) {
					psmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 		readDept		findDept	findDeptList
		public static void selectDept() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; //db 연결
//		Statement stmt = null;	//연결하여 SQL 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		
		ResultSet rs = null;	//SQL 실행 Select 결과 저장하는 객체
		
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 쿼리 준비
		String sqlQuery = "select * from dept";
		try {
			
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	//다음 읽어올 데이터가 있는가? True 데이터가 있다
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs !=null) {
				rs.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
				
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
	
}
