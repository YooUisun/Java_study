package study.Test;

import java.util.Random;

public class RouletteGame {
	private String gameId; // 게임 ID
	private String gameName; // 게임 이름
	private int totalPoints; // 총합 점수
	private int successCount; // 성공 횟수
	private int failCount; // 실패 횟수
	private int chargeAttempts; // 잔여 시도 횟수
	private int sales; // 매출액

	// 생성자
	public RouletteGame(String gameId, String gameName) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.totalPoints = 0;
		this.successCount = 0;
		this.failCount = 0;
		this.chargeAttempts = 0;
		this.sales = 0;
	}

	// 충전 메서드
	public void charge(int amount) {
		if (amount % 1000 != 0) {
			System.out.println("충전 금액은 1000원 단위로만 가능합니다.");
			return;
		}
		if (chargeAttempts > 0) {
			System.out.println("잔여 시도 횟수가 남아 있어 추가 충전이 불가능합니다.");
			return;
		}
		chargeAttempts += amount / 1000; // 1000원당 1회 충전
		sales += amount; // 매출액 증가
		System.out.println(amount + "원이 충전되었습니다. 잔여 시도 횟수: " + chargeAttempts);
	}

	// 게임 실행 메서드
	public void playGame() {
		if (chargeAttempts <= 0) {
			System.out.println("잔여 시도 횟수가 없습니다. 충전 후 게임을 시작하세요.");
			return;
		}
		chargeAttempts--; // 잔여 시도 횟수 차감

		Random random = new Random();
		int result = random.nextInt(6) + 1; // 1~6 사이의 랜덤 숫자

		if (result <= 4) { // 성공 (1~4)
			successCount++;
			totalPoints += result; // 해당 점수 누적
			System.out.println(result + "포인트 성공! " + result + "포인트를 획득했습니다!");
		} else { // 실패 (5~6)
			failCount++;
			System.out.println(result + " 나왔습니다. 실패!");
		}

		System.out.println("남은 잔여 시도 횟수: " + chargeAttempts);
	}

	// 현재 상태 출력
	public void showStatus() {
		System.out.println("게임 이름: " + gameName);
		System.out.println("총합 포인트: " + totalPoints);
		System.out.println("성공 횟수: " + successCount);
		System.out.println("실패 횟수: " + failCount);
		System.out.println("잔여 회수: " + chargeAttempts);
		System.out.println("총 매출액: " + sales + "원");
	}

	// 게임 종료 메서드
	public boolean endGame() {
	    if (chargeAttempts > 0) {
	        System.out.println("잔여 시도 횟수가 남아 있어 게임을 종료할 수 없습니다. 메인 메뉴로 돌아갑니다.");
	        return false; // 종료 실패
	    }
	    System.out.println("게임이 종료되었습니다.");
	    System.out.println("최종 상태:");
	    showStatus();
	    return true; // 종료 성공
	}
}