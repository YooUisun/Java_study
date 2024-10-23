//2024-10-23 중첩반복문 연습문제

package study.practice;

//2024-10-23 연습문제 3
import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연습문제 3-1
		
//		Scanner scanner = new Scanner(System.in);
//		int i =0;
//		int j =0;
//		for (i=1; i<=5; i++) {
//			for (j=i; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("================");
// 		연습문제 3-2
//		int a =0;
//		int b =0;
//		for (a=1; a<=4; a++) {
//			for (b=1; b<=a; b++) {
//				System.out.print("*");
//		}
//		System.out.println();
//	}
		// 연습문제 3-3
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = scanner.nextInt();
		
		System.out.println("약수 : ");
		for (int i = 1; i<= num; i++) {
			if(num % i == 0) {
				System.out.println(i + " ");
			}
		}
		
	}
}
