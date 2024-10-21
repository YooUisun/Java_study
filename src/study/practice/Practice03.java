//2024-10-21 오후 연습문제

package study.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//우선순위 4 < 100 < 400 
		// 2000 O    O     O
		// 2100 O    O     X 
		// 2024 O    X     X
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Year: ");
		int year = scan.nextInt();
		
		if(year%400 == 0) {
			System.out.println("윤년 O");
		} else if (year%100 == 0) {
			System.out.println("윤년 X");
		} else if (year%4 == 0) {
			System.out.println("윤년 O");
		} else {
			System.out.println("윤년 X");
		}
		
		
		System.out.println("============");

		System.out.println("반복문 1개로 결과 만들기");

			for (int i=1; i<=5; i++) { 
				for (int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
			}
			System.out.println("=========");

			System.out.println("반복문 2개 중첩해서 결과만들기");

			for (int i=1; i<=5; i++) {
				for (int j=1; j<=5; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
	}

}
