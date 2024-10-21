//2024-10-21 자바 모닝퀴즈

package study.quiz;

public class Quiz05_2024_10_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번
		int x, y, z, q;
		x =10;
		y =3;
		
		z = x++ / ++y;
		q = --x % --y;
		System.out.println("x="+x+", y="+y+", z="+z+", q="+q);
		
		// 2번
		int tall = 160;
		if(tall > 120) {
			System.out.println("범퍼카 가능");
		}
		if(tall > 150) {
			System.out.println("자이로드롭 가능");
		} else if(tall >158) {
			System.out.println("귀신의집 가능");
		} else {
			System.out.println("불가능");
		}
		if(tall >170) {
			System.out.println("롤러코스터 가능");
		}
		if(!(tall >180)) {
			System.out.println("회전목마 가능");
		}
		
		char grade = 'B';
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("등급은 A 입니다.");
		case 'B' :
		case 'b' :
			System.out.println("등급은 B 입니다.");
		case 'C' :
		case 'c' :
			System.out.println("등급은 C 입니다");
		case 'D' :
		case 'd' :
			System.out.println("등급은 D 입니다.");
			break;
			default:
				System.out.println("등급은 F 입니다.");
		}
		
		
		
	}
	

}
