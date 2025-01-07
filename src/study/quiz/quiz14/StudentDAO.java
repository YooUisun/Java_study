package study.quiz.quiz14;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws SQLException {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
            String user = "scott"; 
            String password = "tiger"; 
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("DB 연결 실패");
        }
    }

    public List<StudentDTO> getAllStudents() throws SQLException {
        List<StudentDTO> studentList = new ArrayList<>();
        String query = "SELECT * FROM student";  
        try (PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                int grade = rs.getInt("grade");
                String jumin = rs.getString("jumin");
                java.sql.Date birthday = rs.getDate("birthday");
                String tel = rs.getString("tel");
                double height = rs.getDouble("height");
                int deptno1 = rs.getInt("deptno1");
                int deptno2 = rs.getInt("deptno2");
                int profno = rs.getInt("profno");

                StudentDTO student = new StudentDTO(id, name, grade,jumin, birthday, tel, height, deptno1, deptno2, profno);
                studentList.add(student);
            }
        }
        return studentList;
    }
    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
