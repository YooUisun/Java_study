

//2024-10-21 자바 반복문 for 문과 while 문 에 대해서 중간퀴즈


package study.quiz;

public class Quiz06_2024_10_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번문제
		System.out.println("For 1번문제");
		for (int i=0; i<=10 ; i++) {
			System.out.println(i + " ");
		}
		System.out.println(); //줄바꿈
		
		
		// 2번문제
		System.out.println("For 2번문제");
		for (int i=1; i<10; i++) {
			System.out.println(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		
		// 3번문제
		System.out.println("For 3번문제");
		for (int i=10; i<=100; i=i+10) {
			System.out.println(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		
		// 4번문제
		System.out.println("For 4번문제");
		for (int i=25; i<=100; i=i+25) {
			System.out.println(i + " ");
		}
		System.out.println(); // 줄바꿈

		
		// 5번문제
		int i= 50;
		System.out.println("while 5번문제");
		while (i <=55) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println(); // 줄바꿈
		
//		i=50;
//		while(true) {
//			System.out.println(i+ " ");//54
//			i++; //55
//			if(i>55)
//				break;
//		}	
//		System.out.println(); // 줄바꿈
		
		// 5번 문제는 둘 중 하나를 이용해서 하면 됨.

		//6번문제
		i=10;
		System.out.println("while 6번문제");
		while (i>=1) {
			System.out.println(i+ " ");
			i--;
		}
		System.out.println(); // 줄바꿈
		
		//7번문제
		i = 30;
		while (i>=0) {
			System.out.println(i+ " ");
			i= i-5;
		}
		System.out.println();
		
		//8번 문제
		i = 30;
		while (i>=5) {
			System.out.println(i+ " ");
			i= i-5;
		}
		System.out.println();
		
		
		//9번 문제
		i = 25;
		while (i>=0) {
			System.out.println(i+ " ");
			i= i-5;
		}
		System.out.println();
	}
		

}
