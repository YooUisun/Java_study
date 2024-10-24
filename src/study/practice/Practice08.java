//2024-10-23 중첩반복문 연습문제

package study.practice;

//2024-10-23 연습문제 3
import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연습문제 3-1
//		
//		Scanner scanner = new Scanner(System.in);
//		int i=0;
//		int j=0;
//		for (i=1; i<=5; i++) {       //5번 반복이니까 5 넣는거임 3번 바꾸면 3 넣어주면 됨
//			for (j=i; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			
			// 아래 방식으로 할 수도 있음.
//			for(int i=1; i<=5; i++) {
//				for (j=i; j<=(5-1); j++{
//			 	System.out.print("*");
//		
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
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("입력 : ");
//		int num = scanner.nextInt();
//		
//		System.out.println("약수 : ");
//		for (int i = 1; i<= num; i++) {
//			if(num % i == 0) {
//				System.out.println(i + " ");
//			}
//		}
		
		// 연습문제 3-4 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		// 숫자를 입력받고 아래 문양으로 * 출력하기 *이 5개 갔다가 1개로 돌아오는 방법
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("입력 : ");
//		int num = scanner.nextInt();
//		
//		//~num 늘어나는 형태 1 2 3 4 5 이렇게 
//		for(int i=1; i<=num; i++) { //i:1 2 3 4 5 
//			for(int j=1; j<=i; j++) { // j:1 12 123 1234 12345
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//num -1 ~ 점점 줄어드는 형태
//		// 4 3 2 1
//		// int i=num-1; 을 줬으므로 1개씩 더 빠짐
//		for (int i=num-1; i>=1; i--) { //6543 2 1
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 연습문제 3-5 
		// 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
//			int sum = 0;
//			for(int i=1; i<=10; i++) {
//				for(int j=1; j<=i; j++) {
//					sum = sum +j;
//				}
//			}
//		System.out.println("총합 : " + sum);
		
		//연습문제 3-6
		//  1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		// 100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		
			int total =0;
			int i=1;
			
			for(i=1; total<100; i++ ) {		// i:200
				if(i%2 == 0) { //짝수는 - 하고		198
					total = total -i;	      // -198 => -99
				} else { // 홀수는 + 하고		199
					total = total +i;	//-99 +199 => 100
				}
			}
			System.out.println("누적 합 : " + total + "얼마까지 계산 했는가 : " +(i-1));
				
		total =0;
		i=1;
		while(true) {
			if(i%2 ==0) {
				total = total -i; //199
			} else {
				total = total +i;
			}
			if(total >= 100) {
				break;
			}
			i++;
		}
		System.out.println("누적 합 : " + total + "얼마까지 계산 했는가 : " + i);

	}
}
