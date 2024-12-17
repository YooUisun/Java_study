package study.practice.practice21;

import study.practice.practice21.*;

public class MonitorMain {
    public static void main(String[] args) {
        // 7. 두 개의 모니터 생성
        Monitor monitor1 = new Monitor("삼성", 27, 150000);
        Monitor monitor2 = new Monitor("LG", 32, 330000);

        // 8. 색상과 해상도 설정
        monitor1.setColor("검은색");
        monitor1.setResolution(1080, 780);

        monitor2.setColor("흰색");
        monitor2.setResolution(4096, 2048);

        // 10. 모니터 정보 출력
        System.out.println("1번 모니터 정보:");
        monitor1.printInfo();

        System.out.println("2번 모니터 정보:");
        monitor2.printInfo();

        // 11. 2번 모니터 가격 인상 및 결과 출력
        int newPrice = monitor2.increasePrice(70000);
        System.out.println("2번 모니터의 가격이 7만원 인상되었습니다. 현재 가격: " + newPrice + "원");

        // 12. 다시 모니터 정보 출력
        System.out.println("=== 가격 인상 후 ===");
        System.out.println("1번 모니터 정보:");
        monitor1.printInfo();

        System.out.println("2번 모니터 정보:");
        monitor2.printInfo();
    }
}
