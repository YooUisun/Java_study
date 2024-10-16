//2024-10-16 Variable 시작 

package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 선언은  아래 처럼
		
		int number1; //정수형 숫자 변수
		int floor;  //선언만 한 것이므로 값은 없음
		int x,y,z;
		
//		int x;
//		int y;
//		int z;
//		, 하면 vs코드랑 똑같이 이어서 가능 이름 중복 불가능
		
		
		int score; //선언만 한 거임
		int point = 50; //선언  +  값 저장 = 초기화
		//꼭 선언은 한 번 했으면 그 다음부터는 선언 할 필요가 없음 
		//그러면 선언 이후에는 아래처럼 score = 숫자 이렇게 하면 됨
		
		score = 90;
		
		// level = 99; 선언하지 않은 변수명 사용 불가능
		
		// time = 16; << 선언 이전 에는 사용 불가능 
		int time;
		time = 16; // 이렇게 선언을 하고 해야함
		
		int minute = time + 9; //왼쪽은 변수 선언을 하고 오른쪽은 변수에 값을 주고
					    	    // 16+9 이렇게 됨 위에 보면 타임은 16이고 +9 를 했으니까
		
		//int myFloor = floor + 7; 값이 없는 변수를 계산 할 수 없다.
		
		int totalScore = point + point + point + score + score; 
		//변수 값을 계속 연속적으로 사용 가능 ex) point + point + 이런식으로
	
		System.out.println("출력합니다.");
		System.out.println(); // sysout -> ctrl+space 하면 왼쪽 명령어 자동완성됨
		System.out.println(totalScore);
		System.out.println(totalScore + point);
						// TotalScore 330 + 50 = 380
		System.out.println( totalScore );    //330
		totalScore = totalScore + point;     //380
		//tptalScore  =      330 + 50
		System.out.println(totalScore);      //380
		
		
		x = 10; // << 얘가 리터럴임 리터럴은 정확한 값을 가진 얘를 리터럴 이라고 부름
		y = x;
		z = x + y;
		
		
		
		int a = 10;
		int b = 20;
		
		// a :10 , b :20 인데 
		// a :20 , b :10  으로 바꾸고 싶다면?
		
		// 아래는 서로 값 바꾸기 실패 
		
		/*
		a = b; //a: 20 b:20 이 되어버림
		b = a; //a: 20 b:20 똑같이 됨 실패임 
		*/
		// c 를 하나 더 만들어서 한다면? 
		
		int c = a; // a:10 b:20 c:10
		a = b; 	   // a:20 b:20
		b = c;	   // a:20 b:10 c:10 이 되어버림 이해 못하면 다시 봐 
		
		
	}

}
