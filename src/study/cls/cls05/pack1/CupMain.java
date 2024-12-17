package study.cls.cls05.pack1;

import study.cls.cls05.pack2.Cup;

public class CupMain {

    public static void main(String[] args) {
        // pack1의 Cup 객체 생성
        study.cls.cls05.pack1.Cup c1 = new study.cls.cls05.pack1.Cup();
        c1.method();

        // pack2의 Cup 객체 생성
        study.cls.cls05.pack2.Cup c2 = new study.cls.cls05.pack2.Cup();
        c2.method();

        // pack1의 Cup 객체 생성 (매개변수 생성자 사용)
        study.cls.cls05.pack1.Cup c3 = new study.cls.cls05.pack1.Cup("유리컵");
        c3.method();

        // type 필드에 값 설정 (Setter 사용)
        c3.setType("유리컵");
        System.out.println("c3의 type: " + c3.getType());

        // 새로 생성한 Cup 객체
        study.cls.cls05.pack1.Cup cc = new study.cls.cls05.pack1.Cup();
        cc.setType("머그컵");
        cc.method();
        System.out.println("cc의 type: " + cc.getType());
    }
}
