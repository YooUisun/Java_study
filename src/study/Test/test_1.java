//2024-10-31 1번 테스트 

package study.Test;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int hitCount = 0; // 안타수 저장 용도
		int outCount = 0; // 아웃수 저장 용도

		System.out.println("=====한화 이글스 게임을 시작합니다=====");
        System.out.println();
        
		 while (outCount < 3) {
			int pitchBall = (int) (Math.random() * 10) + 1; //  투수가 던지는 공 1~10랜덤

			System.out.print("류현진 선수 공을 던져주세요 : ");
			int playerBall = scan.nextInt(); // 내가 입력한 공

			// 입력한 공이 0또는 10이상의 수를 입력하면
			if (playerBall < 1 || playerBall > 10) {
				System.out.println("*공은 1~10까지 던질 수 있습니다.*");
			} else { 

				// 투수공과 유저공이 같으면 안타수 증가
				if (pitchBall == playerBall) {
					hitCount++;
				} else { // 다르면 아웃수 증가
					outCount++;
				}

				System.out.printf("투수:%d 플레이어:%d 안타:%d 아웃:%d\n", 
                pitchBall, playerBall, hitCount, outCount);
                System.out.println();

				// 아웃 3번이 되면 반복문 종료
				if (outCount == 3) {
					System.out.println("===게임을 종료합니다===");
					break;
				}
			}
		}
	}

}
