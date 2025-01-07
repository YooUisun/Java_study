package study.quiz.quiz14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StudentDAO studentDAO = new StudentDAO();

            // 전체 데이터 조회
            System.out.println("\n=== 전체 Student 데이터 ===");
            List<StudentDTO> allStudents = studentDAO.getAllStudents();
            if (allStudents.isEmpty()) {
                System.out.println("학생 데이터가 없습니다.");
            } else {
                for (StudentDTO student : allStudents) {
                    System.out.println(student);
                }
            }

         

            // DB 연결 종료
            studentDAO.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
