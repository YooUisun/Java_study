//2024-10-31 2번 테스트 


package Test;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int hitCount = 0; // 안타수
		int outCount = 0; // 아웃수

		System.out.println("===한화 이글스 1단계 게임을 시작합니다===");

		// 총횟수만큼만 게임 진행
		for (int round= 1; round <=3; round++) {   //1회부터 3회 까지 반복 한다는 말
			System.out.printf("%d회차\n", round);
            System.out.println();

			 while (outCount < 3) {
				int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 공 1~10랜덤

				System.out.print("류현진 선수 공을 던져주세요 : ");
				int playerBall = scan.nextInt(); // 내가 입력한 공

				// 입력한 공이 0또는 10이상의 수를 입력하면
				if (playerBall < 1 || playerBall > 10) {
					System.out.println("*공은 1~10까지 던질 수 있습니다.*");
				} else { 

					// 투수공과 유저공이 같은면 안타수 증가
					if (pitchBall == playerBall) {
						hitCount++;
					} else { // 다르면 아웃수 증가
						outCount++;
					}

					System.out.printf("[투수:%d 플레이어:%d 안타:%d 아웃:%d]\n", 
                    pitchBall, playerBall, hitCount, outCount);
                    System.out.println();

					// 아웃 3번이 되면 반복문 종료
					if (outCount == 3) {
						System.out.printf("===%d회차를 종료합니다===\n", round);
						outCount =0; // 회차 종료시 아웃갯수 0으로 초기화
						break;
					}
				}
				
				
			}	//while 문 종료
		} // for 문 종료
		
		System.out.println("===게임을 종료합니다===");
		
	}
	

}
