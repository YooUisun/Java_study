// 2024-10-23 아침 연습문제


package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제 2x + 4y = 10 이 
		// 만족하는 모든 x, y 쌍을 구하세요. (x와 y는 자연수 1~10)
		
//        	  for(int x=1 ; x<=10 ; x++){
//        	   for(int y=1 ; y<=10 ; y++ ){
//        		   
//        		   if(2*x + 4*y > 10) {
//        			   break;
//        		   }
//        		   //x y
//        		   //x:1 y:2 y:3~10
//        		   //x:3 y:1 y:2~
//        		   //x:4 y:1 
//        		   if(2*x + 4*y == 10) {
//        			   System.out.printf("(x:%d y:%d) \n", x, y);
//        		   
//        		   }
//        	  }
//         }
        	   
		//2번 문제
//       Scanner scanner = new Scanner(System.in);
//		System.out.print("정수2개 입력:");
//		int input1 = scanner.nextInt();
//		int input2 = scanner.nextInt();
//			if(input1>input2) { // input1 이 더 크다
//				System.out.printf("%d = %d = %d\n", input1, input2, input1-input2);
//			} else {
//				System.out.printf("%d -%d = %d\n", input2, input1, input2-input1);
//			}

		
		
			//3번 문제 윳놀이
		Scanner scanner = new Scanner(System.in);
		System.out.println("윳 던지기 정수 4개 입력 1or0: ");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();
		int input4 = scanner.nextInt();
		
		int sum = input1 + input2 + input3 + input4;
		
		if (input1 + input2 + input3 + input4 == 1) {
			System.out.println("결과 : 도");
		} else if (input1 + input2 + input3 + input4 == 2) {
			System.out.println("결과 : 개");
		} else if (input1 + input2 + input3 + input4 ==3) {
			System.out.println("결과 : 걸");
		} else if (input1 + input2 + input3 + input4 ==4) {
			System.out.println("결과 : 윳");
		} else if (input1 + input2 + input3 + input4 ==5) {
			System.out.println("결과 : 모");
		} else {
			System.out.println("잘못입력했습니다.");
		}
			//4번 문제 입력받은 수 만큼 별을 입력해라.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int input1 = scanner.nextInt();
//			for (int a=1; a<=input1; a++) {
//				System.out.print("*");
//			}
			
	}
}
