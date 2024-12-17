// Monitor 클래스 정의
package study.practice.practice21;
public class Monitor {
    // 1. 필드변수 선언
    private String manufacturer; // 제조회사
    private int size;            // 인치
    private int price;           // 가격
    private String color;        // 색상 (옵션)
    private int resolutionX;     // 최대해상도 x (옵션)
    private int resolutionY;     // 최대해상도 y (옵션)

    // 3. 필수값을 받는 생성자
    public Monitor(String manufacturer, int size, int price) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.price = price;
    }

    // 4. 색상과 해상도를 설정하는 set 메소드
    public void setColor(String color) {
        this.color = color;
    }

    public void setResolution(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    // 5. 전원을 켜는 메소드
    public void powerOn() {
        System.out.println("전원이 켜졌습니다.");
    }

    // 6. 가격 인상 메소드
    public int increasePrice(int amount) {
        this.price += amount;
        return this.price;
    }

    // 9. 정보 출력 메소드
    public void printInfo() {
        System.out.println("===== 모니터 정보 =====");
        System.out.println("제조회사: " + manufacturer);
        System.out.println("크기: " + size + "인치");
        System.out.println("가격: " + price + "원");
        System.out.println("색상: " + (color == null ? "미지정" : color));
        if (resolutionX != 0 && resolutionY != 0) {
            System.out.println("해상도: " + resolutionX + " x " + resolutionY);
        } else {
            System.out.println("해상도: 미지정");
        }
        System.out.println("======================");
    }
}
