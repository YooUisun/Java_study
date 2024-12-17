//2024-10-31 4번 테스트 


package study.Test;

import java.util.Scanner;

public class test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 타자 등록
		String playerArr[] = {"최인호", "페라자 ", "안치홍", 
				"노시환","채은성", "김태연", "장진혁 ",
				"이도윤", "최재훈 "};

		Scanner scan = new Scanner(System.in);
		
		int hitCount = 0; // 안타수
		int outCount = 0; // 아웃수
		int totalRound = 3; // 총횟수
		int playerIndex = 0; // 선수 순번(차레)를 저장하는 인덱스
		
		//      안타수
		//	타율	--------
		//		타석수
		int batCountArr[] = new int[9]; // 선수별 타석수
		int hitCountArr[] = new int[9]; // 선수별 안타수
		double battingAvg = 0; // 타율

		System.out.println("===한화이글스 3단계 게임을 시작합니다===");

		// 총횟수만큼만 게임 진행
		for (int i = 1; i <= totalRound; i++) {
			System.out.printf("%d회차\n", i);
            System.out.println();

			 while (outCount < 3) {
				// 선수 입장
				System.out.printf(">>>%d번 타자 '%s선수' 입장\n", 
						(playerIndex+1), playerArr[playerIndex]); // 선수배열[인덱스]
				
				int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 공 1~10랜덤

				System.out.print("1선발 오타니 선수 공을 던져주세요 : ");
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
					
					
					playerIndex++; // 다음 선수를 위해 값 증가
					// 9명의 선수가 다 출루했으면 초기화
					if(playerIndex == playerArr.length) { 
						playerIndex = 0;
						
					}
					System.out.printf("[투수:%d 플레이어:%d 안타:%d 아웃:%d]\n", 
                    pitchBall, playerBall, hitCount, outCount);
                    System.out.println();
                    
                    
                    //타율
                    int hitPlusOut = hitCount + outCount; // 타석수 계산
                    double avgBatting;

                    if (hitPlusOut == 0) {
                        avgBatting = 0.0; // 타석수가 0일 경우 타율을 0으로 설정
                    } else {
                        avgBatting = (double) hitCount / hitPlusOut; // 타율 계산
                    }

                    System.out.printf(">>> 타율: %.2f (안타: %d / 타석: %d)\n", 
                    		avgBatting, hitCount, hitPlusOut);
                    
                    
                    System.out.println();

                    
					// 아웃 3번이 되면 반복문 종료
					if (outCount == 3) {
						System.out.printf("===%d회차를 종료합니다===\n", i);
						break;
					}
				}
			}
			outCount = 0; //다음 회차 시작 전에 아웃카운트 초기화
		}
		
		
		System.out.println("===게임을 종료합니다===");
		
	}
	

}
