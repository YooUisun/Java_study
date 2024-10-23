//2024-10-22 오후 배열 연습문제


package study.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번문제
		Scanner scanner = new Scanner(System.in);
		
		int[]numArr = new int [5];
		System.out.print("5개 정수를 입력하세요 : ");
		for(int i=0; i<numArr.length; i++) {
			// i: 0 1 2 3 4
			numArr[i] = scanner.nextInt();	
			}
		
		System.out.print("몇 번째 수 인가요? : ");
		int index = scanner.nextInt();
		System.out.println("결과 : " + numArr[index-1]);
		
		//0 1 2 3 4 << 개발자들이 생각하는 순번 
		
//		numArr[0] = scanner.nextInt();
//		numArr[1] = scanner.nextInt();
//		numArr[2] = scanner.nextInt();
//		numArr[3] = scanner.nextInt();
//		numArr[4] = scanner.nextInt();
		//2번 문제
		
		Scanner scanner1 = new Scanner(System.in);
		
		int[] numArr1 = new int[5];
		
		System.out.print("5개 정수를 입력하세요 : ");
		for(int i=0; i<numArr1.length; i++) {
			numArr1[i] = scanner1.nextInt();
		}
		System.out.print("결과 : ");
		for(int i=4; i>=0; i--) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println("==================");

		//3번 문제
		Scanner scanner2 = new Scanner(System.in);
//		int[][] nArr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16} };
		//위에처럼 해도 되지만 아래처럼 하면 간단하게 표기 가능함
		int[][] nArr = new int [4][4];
		
		int num =1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nArr[i][j] = num++;
			}
		}
		// i : 0 0 0 0 1 1 1 1 ....
		// j : 0 1 2 3 0 1 2 3 ...
		// num : 1 2 3 4 5 6 7 8 ...
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
//				System.out.print(nArr[i][j] + "");
				System.out.printf("%3d" , nArr[i][j]);
		//위에 처럼 %3d 하면 3자리를 차지해서 출력을 하면 띄어지는 것 처럼 보임
			}
			System.out.println();
		}
	}

}
