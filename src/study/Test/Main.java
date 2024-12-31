package study.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RouletteGame game = new RouletteGame("001", "룰렛 게임");

        while (true) {
            System.out.println("\n메뉴 선택: 1. 충전  2. 게임 시작 3. 마감");
            int choice = -1;
            // 유효한 메뉴 선택이 이루어질 때까지 반복
            while (choice < 1 || choice > 4) {
                try {
                    choice = scanner.nextInt();
                    if (choice < 1 || choice > 4) {
                        System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    scanner.nextLine();  // 잘못된 입력을 처리하고 버퍼를 비웁니다.
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("충전 금액을 입력하세요 (1000원 단위): ");
                    int amount = -1;
                    // 금액이 1000원 단위로 입력될 때까지 반복
                    while (amount % 1000 != 0 || amount <= 0) {
                        try {
                            amount = scanner.nextInt();
                            if (amount % 1000 != 0) {
                                System.out.println("1000원 단위로 금액을 입력하세요.");
                            } else if (amount <= 0) {
                                System.out.println("0보다 큰 금액을 입력하세요.");
                            }
                        } catch (Exception e) {
                            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                            scanner.nextLine();  // 잘못된 입력을 처리하고 버퍼를 비웁니다.
                        }
                    }
                    game.charge(amount);
                    break;
                case 2:
                    game.playGame();
                    break;
                case 3:
                    if (!game.endGame()) {
                        // 종료할 수 없으면 메뉴로 돌아감
                        continue; // 메인 메뉴로 돌아감
                    }
                    scanner.close(); // 게임 종료 시 자원 해제
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }
}