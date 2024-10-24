//2024-10-24 오후 마지막 연습문제

package study.practice;

import java.util.Scanner;

public class Practice09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        for (;;) {
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 조회");
            System.out.println("4. 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴번호를 입력하세요:");

            int choice = scanner.nextInt(); 

            String put = ""; 

            switch(choice) {
                case 1: 
                    put = "입력"; 
                    System.out.println("입력 메뉴입니다.");
                    break;
                case 2: 
                    put = "수정"; 
                    System.out.println("수정 메뉴입니다.");
                    break;
                case 3: 
                    put = "조회"; 
                    System.out.println("조회 메뉴입니다.");
                    break;
                case 4: 
                	put = "삭제"; 
                    System.out.println("삭제 메뉴입니다.");
                    break;
                case 5: 
                    System.out.println("프로그램을 종료합니다."); 
                    return;
                    
                default: 
                    System.out.println("잘못된 입력입니다. 다시 시도하세요."); 
                    break;
            
            }
        }
    }
}
