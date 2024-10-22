//2024-10-22 모닝퀴즈

package study.quiz;

import java.util.Scanner;

public class Quiz07_2024_10_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("생년월일:");
		int birthday = scanner.nextInt();
		System.out.println("주민번호 뒷 자리 첫 번째:");
		int lastNumber = scanner.nextInt();
		int age = 2024-birthday+1; //한국나이 계산법
		
		if (lastNumber == 1 || lastNumber ==3) {
			System.out.println("Age : " + age + "살 남자" + "입니다.");
		}
		} else if (lastNumber == 2 || lastNumber ==4) {
			System.out.println("Age : " + age +"살 여자" + "입니다. ");
		} else 
			System.out.println("잘못된 입력");
		if (age >=120) {
			System.out.println("사망했습니다.");
		}
		
		
		
	}

}
