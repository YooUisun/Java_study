//2024-10-18 연습문제

package study.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제.
		
		//1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 /2 ;
		
//		Scanner scanner = new Scanner (System.in);
//		System.out.println("밑변 입력 :");
//		int width = scanner.nextInt();
//		System.out.println("높이 입력 :");
//		double height = scanner.nextDouble();
//		System.out.println("삼각형의 넓이는 " + (width*height/2 ) + "입니다." );

		
//		 맨 밑 두줄은 이렇게 바꿀 수 도 있음.
//		int height = scanner.nextInt();
//		System.out.println("삼각형의 넓이는 " +((double)width*height/2) + "입니다.");
		
		
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;	
		
//				Scanner scanner = new Scanner (System.in);
//				
//				System.out.println("윗변 입력 :");
//				int up = scanner.nextInt();
//				System.out.println("밑변 입력 :");
//				int width = scanner.nextInt();
//				System.out.println("높이 입력 :");
//				double height = scanner.nextDouble();
//				
//				System.out.println("사다리꼴의 넓이 :" + ( (up+width)*height/2.0));
		
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.		
		
//		int personCount = 24;
//		int snackCount = 100;	// 100/24 하면 됨
//		
//		System.out.println("한명당 " + (snackCount/personCount) + "개 과자를 나누고");
//		System.out.println("남는 과자는 " + (snackCount%personCount) + "개 입니다.");
		
		
		
		// 4번. 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("세자리 정수 입력");
//		int num = scanner.nextInt();
//		System.out.println("백의자리 : "+ (num/100) );
//		System.out.println("십의자리 : "+ (num/10%10) );
//		System.out.println("일의자리 : "+(num%10) );
//
//		// 5번 문제 .
		//x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		
//		int x = 10;
//		int y = 20;
//		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
//		int temp = x;
//		x = y; // x:10 이었는데 <- y:20
//		y = temp; // y:20 <- temp:10
//		System.out.println("x="+x+ " y="+y);
//		
		
	//	System.out.println(=============================);
		
		
		
//		2-1번문제
//		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.
		
//		Scanner scanner = new Scanner (System.in);
//		System.out.println("정수 입력하세요(1~24) : ");
//		int time = scanner.nextInt();
//		
//		if( time >= 1 && time <= 24 ) {
//			
//			//정상범위 1~24
//			if( time <= 12) { // 1~12
//				//오전
//				//이른/늦은
//				System.out.println("오전입니다.");
//
//				if( time <= 6) {
//					System.out.println("이른 오전입니다.");
//				} else {
//					System.out.println("늦은 오전입니다.");
//				}
//				
//				
//			} else {	// 13 ~ 24
//				//오후
//				//이른/늦은
//				System.out.println("오후입니다.");
//				if( time <= 18) {
//					System.out.println("이른 오후 입니다.");
//				} else {
//					System.out.println("늦은 오후 입니다.");
//
//				}
//			}
//		} else { //잘못된 범위 값을 입력한 경우
//			System.out.println("잘못입력했습니다.");
//		}
//		
//		
////		2-2번 아래 코드를 if문으로 변경
//		int diceNum = 1;
//		if(diceNum ==1 ) {
//			System.out.println("1");
//		} else if (diceNum ==2) {
//			System.out.println("2");
//		} else if (diceNum == 3) {
//			System.out.println("3");
//			System.out.println("4");
//			System.out.println("5");
//		} else if (diceNum ==4 ) {
//			System.out.println("4");
//			System.out.println("5");
//		} else if (diceNum ==5 ) {
//			System.out.println("5");
//		} else {
//			System.out.println("6");
//		}
//		System.out.println("-------------------------------");
//		
//		
//		//2-3번 아래 코드를 swtich 문으로 변경
//		Scanner scan = new Scanner(System.in);        
//		System.out.print("localNumber: ");
//		String localNum = scan.nextLine();
//		switch(localNum) {
//		case "031":        
//		    System.out.println("경기도입니다.");
//		    break;
//		case "02":
//			System.out.println("서울입니다.");
//			break;
//		case "041":
//			System.out.println("충남입니다.");
//			break;
//		case "051":
//			System.out.println("부산입니다.");
//			break;
//		default: 	
//			System.out.println("default");
//		}
//		System.out.println("-------------------------------");
//
//		//4번 아래 코드를 switch 문으로 변경
		int score;
		score = 85;  // 이 스코어를 변경하면 됨
		if( score >= 90) {
			System.out.println("학점 A");
			} else if ( score >= 80) {
			System.out.println("학점 B");
			} else if (score >= 70) {
			System.out.println("학점 C");
			} else if (score < 70) {
			System.out.println("학점 F");
			}
		
		System.out.println("----------제꺼----------");
		
		int score1 = score;
		switch(score1) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:					
			System.out.println("학점 A");
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:			
			System.out.println("학점 B");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70: 
			System.out.println("학점 C");
			break;
			default:
				System.out.println("학점 F");
		
}

	}
	
}
	



