//2024-10-21 실행문, for 반복문 오후 수업내용 

package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// j:1
		// j:1 2 3 
		
		// j:2
		// J:123
		
		// j:3
		// j:1 2 3 
		
		// j:4
		// J:123		
		
		// j:5 
		// j:1 2 3 
		
		// j:6
		// J:123
		
		// 이런식으로 제목 1 부제 1,2,3 이 5번 반복되는 for 반복문 이다.
		for(int i=1; i<=5; i++) { // i: 1 2 3 4 5 
			
			//실행문
			System.out.println("for i 내부 실행문 시작" + i);
			for (int j=1; j<=3; j++) {
				System.out.println("for j 실행문" + j);
			}
				
			System.out.println("for i 내부 실행문 끝");

		} 
		
		
//      방이 3개가 있는데 
//		2번 쓸고 
//		3번 닦고 
//		1번 쓰레기 정리를 한다고 생각을 해 보자
		
		for(int i=0; i<3; i++) {
			
			int j=1;
			while(j<=2) {
				System.out.println("쓸기");
				j++;
			}
			for(int k=0; k<3; k++) {
				System.out.println("닦기");
			}
			System.out.println("쓰레기정리");
			}
		
	
	}

}
