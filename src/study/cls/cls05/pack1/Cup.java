package study.cls.cls05.pack1;

public class Cup {
    private String type;

    // 기본 생성자 (public으로 변경)
    public Cup() { }

    // 매개변수 생성자
    public Cup(String type) {
        this.type = type;
    }

    // Getter/Setter 메소드
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 메소드
    public void method() {
        System.out.println("pack1.Cup method() 111");
    }
}
