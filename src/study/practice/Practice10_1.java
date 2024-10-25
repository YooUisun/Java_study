//Practice 10 문제 선생님 코딩

package study.practice;

import java.util.Scanner;

public class Practice10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int menu;
        int count;
        String addOrder;

    	int menu1Count =0;
    	int menu2Count =0;
    	int menu3Count =0;

        while (true) {
        	
            System.out.println("========메뉴========");
            System.out.printf("%-10s%8s\n", "1.아메리카노", "3500원");
            System.out.printf("%-10s%8s\n", "2.카페라떼", "4100원");
            System.out.printf("%-10s%8s\n", "3.바닐라라떼", "4300원");
            System.out.println("========================");
            
            System.out.print("메뉴 선택 : "); // 1, 2, 3
            menu = scanner.nextInt(); // 중복 선언 제거
            if (menu < 1 || menu > 3) {
                System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                continue; // 잘못된 선택 시 다시 루프의 처음으로
            }
            
            System.out.print("수량 선택 : ");
            count = scanner.nextInt(); // 중복 선언 제거
            if (count <= 0) {
                System.out.println("수량은 1 이상이어야 합니다.");
                continue; // 잘못된 수량 입력 시 다시 루프의 처음으로
            }
            
            scanner.nextLine(); // 입력값 청소
            System.out.print("추가 주문 하시겠습니까? Y/N: ");
            addOrder = scanner.nextLine(); // 중복 선언 제거

            if (addOrder.equalsIgnoreCase("n")) { // 대소문자 구분 없이 비교
                // 총액 계산
                int total = 0;
                switch (menu) {
                    case 1:
                        total = count * 3500;
                        System.out.printf("주문한 메뉴: 아메리카노 %d개\n", count);
                        break;
                    case 2:
                        total = count * 4100;
                        System.out.printf("주문한 메뉴: 카페라떼 %d개\n", count);
                        break;
                    case 3:
                        total = count * 4300;
                        System.out.printf("주문한 메뉴: 바닐라라떼 %d개\n", count);
                        break;
                }
                System.out.printf("총액: %d원\n", total);
                break; // 주문을 마친 후 루프 종료
            }
        }
        
    }
}
