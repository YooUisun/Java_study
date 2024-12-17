//2024-10-31 3번 테스트 


package Test;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String playerArr[] = {"최인호", "페라자 ", "안치홍", 
						"노시환","채은성", "김태연", "장진혁 ",
						"이도윤", "최재훈 "};

				Scanner scan = new Scanner(System.in);

				int hitCount = 0; // 안타수
				int outCount = 0; // 아웃수
				int totalRound = 3; // 총횟수
				int playerIndex = 0; // 타자 순서 
				System.out.println("===한화 이글스 2단계 게임을 시작합니다===");
				
				//총 횟수만큼만 게임 진행
				for(int i= 1; i <= totalRound; i++) {
					System.out.printf("%d회차\n", i);
					System.out.println();
					
					 while (outCount < 3) {
						System.out.printf(">>>%d번 타자 '%s선수' 입장 \n",
								(playerIndex+1), playerArr[playerIndex]);
						playerIndex++; // 다음 선수를 위해 값 증가
						
						int pitchBall = (int) (Math.random() *10) +1; // 투수가 던지는 공 1~10랜덤

					System.out.print( "1선발 오타니 선수 공을 던져주세요 : ");
					int playerBall = scan.nextInt(); // 내가 입력한 공
					
					// 입력한 공이 0또는 10이상의 수를 입력하면
					if (playerBall < 1 || playerBall >10) {
						System.out.println("*공은 1~10개만 던질 수 있습니다.*");
						
						} else { 
							//투수공과 유저공이 같으면 안타수 증가
							if (pitchBall == playerBall) {
								hitCount++;
							} else { // 다르면 아웃 수 증가
								outCount ++;
							}
							//9명의 선수가 다 출루 했으면 초기화
							if(playerIndex == playerArr.length) {
								playerIndex = 0;
							}
							System.out.printf("[투수:%d 플레이어: %d 안타: %d 아웃: %d]\n",
							pitchBall, playerBall, hitCount, outCount);
							System.out.println();
							
							//아웃 3번이 되면 반복문 종료
							if (outCount == 3) {
								System.out.printf("===%d회차를 종료합니다.===\n", i);
								break;
							}
						}
					}
					outCount = 0; //다음 회차 시작 전에 아웃카운트 초기화
				}
				System.out.println("게임을 종료합니다.");
		}
			}
	


