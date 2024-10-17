
// 2024-10-17 수업내용 연산자에 대해서. *다시 공부할 것*

package study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술 연산
		System.out.println( 1+1 );
		System.out.println( 9-4 );
		System.out.println( 3*1 );
		System.out.println( 7/3.0 ); 
		//int라서 그냥 3 이라고 했으면 소수점 인식을 안 하는데 
		//3.0 이라고 소수점까지 넣어 주면 소수점 까지 인식을 함.
		System.out.printf("%.2f\n", 7/3.0);
		System.out.println( 9%5 );
		
		//부호 연산
		System.out.println(10); 
		System.out.println(+10); 
		System.out.println(-10); 
		System.out.println("--------------------------------------");
		
		
		
		//증감 연산자
		int x = 10;
		System.out.println( x--);                  
		// ++변수 를 하면 +먼저 , 변수++ 를하면 +를 나중에
		System.out.println( x );
		
		int y = 20;
		System.out.println( ++y );  //  ++변수 +를 먼저 , 변수++ +를 나중에
		System.out.println( y ); 	//  => 21
		
		int z = 30;
		System.out.println( z+1 );		// 30+1 => 31
		System.out.println( z );		// 30
		
		int q = 1; //2 
		int w = 3; //2
		int e = 10 + ++q; //10 + ++q; -> 12
		int r = 3 + w--;  // 3+ w-- -> 6
		System.out.printf("%d %d %d %d\n", q,w,e,r);
		
		
		boolean isFinished = false;
		System.out.println( !isFinished); // ! 넣어주면 (NOT) 임  부정+부정 = 긍정
		System.out.println(  isFinished); // 안 넣어주면 그 상태 그대로 False 이다.

		System.out.println("--------------------------------------");

		//비교 연산자
		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 3 < 5 );
		System.out.println( 4 <= 4 );
		System.out.println( 5 > 10 );
		System.out.println( 9 >= 8 );
		boolean b1 = 9 >= 8;
		System.out.println("--------------------------------------");

		//논리
		boolean b2 = ( 10 > 6 ) && ( 10 > 5);
					//  true and연산자라서  true
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1) || (10 < 4 );
		//				trye     	 false
		System.out.println(b3);
		
		boolean b4 = ( 2 >= 1 ) && !(3<4);
		//				True		False   둘 중 한개라도 False가 들어가니 False가 된다
		System.out.println( b4 ); // b4앞에 ! 안 해줬으니 결과값 그대로 갖고온다.
//		System.out.println( !b4 );  !가 들어가기 떄문에 2개가 다 트루가 아니라 False 가 된다

		//대입 연산자
		
		int a = 30;
		a += 30; // 오른쪽에 있는걸 더하고 대입한다 라는 듯 a = a + 30;
		a -= 5;  // a = a -5;
		a *= 3;  // a = a * 3;
		a /= 2;  // a = a / 2;
		a %= 4;  // a =a % 4;
		
		// a += 1; 이랑 ||  a = a + 1; 이렇게 2가지 타입이 있는데 오른쪽을 선호하는 사람이 많음
	
		
		//삼항 연산자 다시 공부하자
		int point = -50;
		// 예를 들면 사은품으로 포인트를 이렇게 준다고 생각해보자 
		// 0~200 : 생수
		// 201 ~ 300 : 커피 
		
		String eventItem = (point <= 200) ? "생수": "커피";
		System.out.println(eventItem);
		
		eventItem = (point > 200) ? "커피" : "생수";

			// 0 ~ 200 : 생수를 주고
			// 201 ~ 300 : 커피
		 	// 301 ~ : 맥주 를 준다고 생각해보자. 중첩을 시켜야함.
			
					//	-50 > 200
		eventItem = (point > 200) ? ( point > 300 ? "맥주" : "커피" ) : ( point >= 0 ? "생수" : "사은품 없음");
								// 201~
		System.out.println(eventItem);
		// 이렇게 위 처럼 하면 사은품 없음이 나옴
		
		eventItem =(point >200) ? ( ( point >=201 && point <=300 ) ? "맥주" : "커피") : "생수";
		    // 							false
		System.out.println(eventItem);

			// (point >= 0 && point <= 200)
	}

	
}
