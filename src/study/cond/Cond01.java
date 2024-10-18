// 2024-10-18 if문 연습 

package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문
		
		int num = 5;
		int x = 10;

		if(num > 10) {
			System.out.println("확인을 해 보니까");
			System.out.println("10보다 크더라~");
			x = 20;
			int y = 30;
		} else {
			System.out.println("10보다는 안 크던데?");
		}
		
		//아래 처럼 사용 할 수도 있다.
		boolean b = num ==15; // true /falst 왜냐면 boolean 이니까
		
//		if( !b ) {
		if( b ) {
			System.out.println("한번더 살펴보니");
			int z =10;
			System.out.println("15랑 똑같더라");
		}
		
		int y = 44;
		int z = 222;
		System.out.println("-----------------------");
		System.out.println("끝");
	}

}
