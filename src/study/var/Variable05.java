//2024-10-17 수업내용

package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//printIn 은 줄바꿈 느낌 한 번 출력 할 때마다 아래로 내려감
			String s = "test";
			System.out.println("출력 1");
			System.out.println("출력 2");
			System.out.println(s);

			//여기서 print만 써주면 옆으로 이어서 출력이 된다.
			
			System.out.print("출력 3");
			System.out.print("출력 4");
			System.out.println(s);
			
			int hour = 10;
			int minute = 26;
			
			//현재 10시 26분 입니다.
			System.out.println("현재 " + hour + "시 " + minute + "분 입니다");
			System.out.printf("현재 %d시 %d분 입니다. \n", hour, minute);
						// \n 하면 줄바꿈이 되어서 그 다음 얘는 아래로 출력이 된다.
			double rate = 1.15512;
			
			System.out.printf("%10.2f %%" , rate);
			// 퍼센트를 표현하고 싶으면 위에 처럼 %% 두번 눌러라 주석 입력할 때 처럼
			
			System.out.println(); // 출력내용은 없는데 ... 줄바꿈 O

			
			
			//스캐너 관련 
			
			Scanner scanner = new Scanner(System.in); //스캐너 선언 하는 방법임 
			
			System.out.print("입력하세요 : "); // 하고선 밑에 터미널에서 아무말 이나 치면 됨
			String input = scanner.nextLine();
			System.out.println(input);
			
			System.out.println("당신이 입력한 값은 : " + input);
			System.out.printf("당신이 입력한 값은 : %s\n", input);
		
			// 점수를 입력하세요 방식
			System.out.print("점수를 입력하세요 : ");
		
			int point = scanner.nextInt(); //Int 값을 받아서 Int로 변환을 하겠다 라는 뜻
			// scanner.nextDouble();
			//String -> int 로 변환을 해야함 
			// 이렇게 하면 점수를 입력하세요 숫자만 입력을 해야함 왜냐면 int 정수로 변환을 했기 때문에
			System.out.println(point);
	}

}
