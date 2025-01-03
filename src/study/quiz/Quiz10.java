package study.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Quiz10 {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "scott";
    private static final String DB_PASSWORD = "tiger";

    public void findAllProfessors() {
        String query = "SELECT profno, name, id, position, pay, deptno FROM professor";
        try (
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            System.out.println("Professor List:");
            boolean hasResults = false; // 결과 여부 체크
            while (resultSet.next()) {
                hasResults = true;
                int profno = resultSet.getInt("profno");
                String name = resultSet.getString("name");
                String id = resultSet.getString("id");
                String position = resultSet.getString("position");
                int pay = resultSet.getInt("pay");
                int deptno = resultSet.getInt("deptno");

                System.out.printf("Profno: %d, Name: %s, ID: %s, Position: %s, Pay: %d, Deptno: %d%n",
                        profno, name, id, position, pay, deptno);
            }
            if (!hasResults) {
                System.out.println("No professors found.");
            }
        } catch (Exception e) {
            System.err.println("Error retrieving data: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Quiz10 professorDAO = new Quiz10();
        professorDAO.findAllProfessors(); // 전체 데이터 조회
    }

}
