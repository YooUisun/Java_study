// 2024-10-23 아침 연습문제

package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		if (num %2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
		
		//2번 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("숫자 입력:");
//		num = input.nextInt();
//		if(num % 7 ==0) {
//			System.out.println(num+": 7의배수 입니다.");
//		} else {
//			System.out.println(num+" : 7의배수가 아닙니다");
//		}
//		
//		//3번  1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
//		int sum = 0;
//		for(int i=1; i<=1000; i++) {
//			if(i%5 ==0) {
//				sum = sum +i;
//			}
//			}
//		System.out.println("총합 : " + sum);
		
		
		//4번 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1~50중 한개를 입력하세요 :");
//		int num = scanner.nextInt();
//		for(int i=1; i<=num; i++) {
//			System.out.print("*");
//	}
		
		
		//5번 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		int result =0;
//		for(int i=1; i<=10; i++) {
//			if(i%2 == 0) { //짝수
//				result = result -i;
//			} else { // 홀수
//				result = result +i;
//			}
//		}
//		
//		System.out.println(result);
		
		// 5번문제는 아래로도 가능함.
		
//		result = 0;
//		for(int i=1; i<=10; i=1+2) { //홀수
//			result = result +i;
//		}
//		for(int i=2; i<=10; i=i+2) {
//			result = result -i;
//		}
//		System.out.println(result);
		
		
		
		//6번 정수를 1부터 계속 누적으로 더한다. 더한 값이 1000보다 작으면 계속 더한다.
//		
//		int total =0;
//		int i = 1;
//		while(total<1000) {
//			total = total + i; // 1 + 2  +3
//			i++; //4
//		}
//		System.out.println("누적 값: " + total);
		//+45 까지 했을때 1035가 나온다.
		
		// 아래 방법으로도 가능하다.
//		total = 0;
//		i = 1;
//		while(true) {
//		total = total + i;
//		i++;
//		
//		if(total >= 1000)
//			break;
//		}
//		System.out.println("누적 값: " + total);
		
		
		
        //7번 구구단 계산법
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("몇 단 출력할래? (1~9) : ");
//        int num = scanner.nextInt();
//        // num = 3;
//        
//        for(int i=1; i<=9; i++) {
//        	System.out.printf("%2d * %2d = %3d\n",num, i, num*i );
//        }

	}

}
