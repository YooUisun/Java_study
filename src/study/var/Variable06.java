//2024-10-17 문자열,술자열 스캐너 비교 방법

package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();		// 10\n 이 된거임
		
		
		System.out.println(num);
		System.out.println(num == 10 );   	
		// == 같다 라는 비교 연산자
		// 이러면 둘이 같냐 라고 물어보면 true or false 
		//F11 을 눌러서 확인을 해보면 10을 입력하면 True 그 외 번호를 입력하면 False
		
		scanner.nextLine(); // 엔터까지 입력을 받아라 너는 \n 청소용이다.
		
		String str = scanner.nextLine();   	// \n 이 입력된거임
		System.out.println(str);
		//아래는 문자열 인데 == 는 숫자열 이므로 아래 =="밥" 은 틀린것이다.
		System.out.println(str == "밥");
		
		//숫자열 비교는 == 을 쓰는데 문자열 비교는 equals를 써야한다.
		
		// 문자열 비교를 하고싶으면 아래 2개중 하나를 사용해서 쓰면 됨.
		System.out.println(str.equals("밥"));  
		System.out.println("밥".equals(str));
	}

}
