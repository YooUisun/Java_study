package study.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
//		---------------------------------------------------------------
//		System.out.println("두 주사위 눈의 합이 6이 되는 경우의 수:");
//		for (int i=  1; i <=6; i++) {
//			for (int j= 1; j <= 6; j++) {
//				if (i+j == 6) {
//					System.out.println("("+ i + ", " + j + ")");
//				}
//			}
//		}
//-------------------------------------------------------------------------------
		
//		2. 
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
// --------------------------------------------------------------------------

//		Random random = new Random();
//		int[] lotto = new int[6];
//		HashSet<Integer> set = new HashSet<>();
//
//		int index = 0;
//		while (set.size() < 6) {
//			int number = random.nextInt(45) + 1; // 1~45 사이의 숫자
//			if (set.add(number)) { // 중복되지 않는 경우에만 추가
//				lotto[index++] = number;
//			}
//		}
//
//		System.out.println("생성된 로또 번호:");
//		for (int num : lotto) {
//			System.out.print(num + " ");
//		}
//----------------------------------------------------------------
//	    3.
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
// --------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][5];
        int totalSum = 0;
        int totalStudents = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "반 점수 입력 (5명):");
            int classSum = 0;
            for (int j = 0; j < 5; j++) {
                scores[i][j] = scanner.nextInt();
                classSum += scores[i][j];
            }
            totalSum += classSum;
            totalStudents += 5;
            System.out.println((i + 1) + "반 평균: " + (classSum / 5.0));
        }

        System.out.println("전체 평균: " + (totalSum / (double) totalStudents));
		
//		-------------------------------------------------------------------------------
//		4. 
//		주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
// --------------------------------------------------------------------------

//        int[][] arr = {
//                {10, 20, 30},
//                {20, 30, 40},
//                {30, 40, 50}
//            };
//
//            int rows = arr.length;
//            int cols = arr[0].length;
//            int[][] result = new int[rows + 1][cols + 1];
//
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    result[i][j] = arr[i][j];
//                    result[i][cols] += arr[i][j]; // 행의 합
//                    result[rows][j] += arr[i][j]; // 열의 합
//                    result[rows][cols] += arr[i][j]; // 전체 합
//                }
//            }
//
//            System.out.println("결과 배열:");
//            for (int i = 0; i <= rows; i++) {
//                for (int j = 0; j <= cols; j++) {
//                    System.out.print(result[i][j] + " ");
//                }
//                System.out.println();
//            }
// --------------------------------------------------------------------------
		//5.
		//엘레베이터 방문 층수를 입력받아 타야 할 엘레베이터를 
		//반환하는 메소드 guide()를 완성하여, 출력 예와 같은 결과를 얻으시오.
// --------------------------------------------------------------------------

        // 테스트 케이스 실행
//        guide(13); // 고층 엘리베이터
//        guide(7);  // 저층 엘리베이터
//        guide(10); // 저층 엘리베이터
//        guide(20); // 고층 엘리베이터
//    }
//
//    public static void guide(int floor) {
//        // 층수에 따른 엘리베이터 안내
//        if (floor >= 1 && floor <= 10) {
//            System.out.println(floor + "층 -> 저층 엘레베이터");
//        } else if (floor >= 11 && floor <= 20) {
//            System.out.println(floor + "층 -> 고층 엘레베이터");
//        } else {
//            System.out.println("잘못된 입력: " + floor + "층은 존재하지 않습니다.");
//        }
//-----------------------------------------------------------------------------------
        //6.
//        돈 놓고 돈 먹기
//        문제
//        어떤 게임이 있다. 이 게임은 주사위를 던저 나오는 눈의 수 만큼 달러를 획득한다. 
//        주사위를 총 3번 던져 얻은 달러. 이를 환전한 결과를 출력 하시오.
		//--------------------------------------------------------------------------
//        int totalDollars = 0;
//
//        // 주사위를 3번 던져 얻은 금액
//        for (int i = 0; i < 3; i++) {
//            totalDollars += dice(); // 주사위 값을 더함
//        }
//
//        // 환율
//        final double EXCHANGE_RATE = 1082.25108;
//        int totalWon = (int) (totalDollars * EXCHANGE_RATE);
//
//        // 결과 출력
//        System.out.printf("획득 금액: $%.2f(%d원)\n", (double) totalDollars, totalWon);
//    }
//
//    // 1과 6 사이의 숫자를 반환하는 메소드
//    public static int dice() {
//        return (int) (Math.random() * 6) + 1; // 1~6 반환
		//--------------------------------------------------------------------------

// 	    7.
//		급여 계산하기 
//		문제
//		당신은 Java 카페의 사장이 되었고, 며칠 후 알바생들에게 급여를 주어야 한다. 급여 조건 및 제약사항은 아래와 같다.
//
//		급여는 주급으로 정산하며 (근무시간) X (기본 시급)을 기준으로 한다.
//		주당 근무가 40시간을 초과 시, 초과분에 대하여 1.5배의 급여를 지급한다.
//		기본 시급은 최저 $8.00이며, 이보다 작은 경우 경고문을 출력한다.
//		주당 근무가 60시간을 넘을 시, 경고문을 출력한다.
//		위 내용을 만족하는 printPay() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.
// --------------------------------------------------------------------------

        // 테스트 케이스 실행
//        printPay(40, 10.0);  // 정상 근무
//        printPay(50, 10.0);  // 초과 근무
//        printPay(40, 7.5);   // 최저 시급 에러
//        printPay(65, 10.0);  // 초과 근무시간 에러
//    }
//
//    public static void printPay(int hours, double wage) {
//        // 최저 시급 검증
//        if (wage < 8.00) {
//            System.out.println("최저 시급 에러!");
//            return;
//        }
//
//        // 최대 근무시간 검증
//        if (hours > 60) {
//            System.out.println("초과 근무시간 에러!");
//            return;
//        }
//
//        double totalPay; // 총 급여 계산
//        if (hours <= 40) {
//            totalPay = hours * wage;
//        } else {
//            // 초과 근무 계산
//            totalPay = 40 * wage + (hours - 40) * wage * 1.5;
//        }
//
//        // 결과 출력
//        System.out.printf("$ %.2f\n", totalPay);
	}
}
