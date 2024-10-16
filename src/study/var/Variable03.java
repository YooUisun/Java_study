//2024-10-16 Variable03


package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = 3.14;
		double d2 = d1;
		
		int i1 = 30;
		int i2 = i1;
//		int i3 = 3.123; //정수형 변수 int 에다가 실수형 값을 못 넣음
		
		// i2 = d2; << 이 말은 int 타입에다가 double을 저장했다는 말임.
		i2 = (int)d2; // 이렇게 하면 강제변환이 가능함 하지만 소수점 0.14가 없어짐
		
				 // i2 = (int)3.14;
		// i2 = 3;
		
		System.out.println(i2); 
		// 이렇게 하면 결과값은 3이 나옴 왜냐면 정수형 이니까!
		// 실수형 에 있던 (double)0.14를 없애버림
		
		
		//java 정수 = int 로 인식을 함
		//java 실수 = double 로 인식을 함
		
		float f1 = 4.43f; // float는 마지막에 f를 넣어주면서 float 입니다 라고 해야함
		double d3 = f1; // 이렇게 해서 출력을 하면 소수점 까지 나온다.
						// double= float 이라서 소수점 까지 나옴.
		
		// 자동타입 변환 하는 방법
		double d4 = 300; //double = 정수형 숫자(int) 자동타입 변환이 된다.
		// 300.0 이렇게 실수형이 된다.
		System.out.println(d4);
		
		//아래는 연산에서 형 변환에 대해서 설명
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		// 아래는 잘못된 케이스 입니다. 
		//int result = intValue + doubleValue;
					// int + double -> double
		//int = double 
		
		//아래는 잘 한 케이스 이렇게 강제변환을 해야함.
		int result = intValue + (int)doubleValue;
		//  int    = int 	  + (int)double 	(int)5.5 -> 5
		//  int    = int      +  5
		
		result = (int)(intValue + doubleValue); //<< 그러면 괄호 안에 있는 숫자는 15.5가 된다
		//			int 10 + double 5.5 -> double 15.5 라는 뜻
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2;
		// 			  5		     6
		System.out.println(rt);
		
		rt = (int)(dv1 + dv2);
		//	        5.5 + 6.6 = 12.1 인데 소수점을 날려버림.
		System.out.println(rt);

		
		
	}

}
