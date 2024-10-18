
//2024-10-17 연산자 중간 퀴즈

package study.quiz;

public class Quiz02_2024_10_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1-1) 결과가 2가 나오도록 작성하세요
		int a = 10;			// 10/4 = 2.5 ㅡ<< int로 result 하면 실수 날라감 그래서 2가됨
		int b = 4;			// 
		int result1 = a/b;
		System.out.println(result1);

//		1-2) 결과가 2.5가 나오도록 작성하세요 
		int c = 10;
		int d = 4;
		double result2 = (double) c/d;
		System.out.println(result2);		
		// 똑같이 2.5 인데 실수를 살려야 하니까 result 옆에 (double) 입력하고 = c/d 하면 2.5가 나옴

		
//		2. 결과가 7.5가 나오도록 작성하세요
		double e = 3.5;			// 3.5 + 4.7 = 8.2 인데 0.7를 날려야함. 
		double f = 4.7;
		double result3 = e + (int) f; 
		// 3.5 + 4.7 = 8.2 인데 0.7를 날려야함.
		// 이렇게 0.7를 갖고있는 f 한테만 실수를 날려버릴 int를 적용시켜주면 3.5+4 = 7.5가 완성됨
		System.out.println(result3);
		
//		3. 계산결과가 12가 나오도록 작성하세요
		String g = "3.4";
		String h = "4";
		int result4 = (int) Double.parseDouble(g) * Integer.parseInt(h);
		System.out.println(result4);
		
//		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		String i = "10"; // 10 + 3*4.5 = 10+13.5 (Int)로 실수 삭제했으므로 1013
		int j = 3;
		double k = 4.5;
		String result5 = i + (int)(j*k);
		System.out.println(result5);
		
//		5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		int l = 4;			// 4
		double m = 3.4;		// 3.4 인데 .4를 날려버리면 3
		String n = "6.8";   // 6.8을 2로 만들어버릴려면 6.8 - I = 2.8 에서 소수점 날리면 2가됨
		String result6 = l * (int)Double.parseDouble(n) + String.valueOf((int) m);
		System.out.println(result6);
		
//		6-1. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int o = 111;
		int p = 13;
		int result7 = o % p ;			// %연산에 대해서 다시 한 번 공부해보기
		System.out.println(result7);

//		6-2. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int q = 111;
		int r = 13;
		int result8 = q / r;
		System.out.println(result8);

	}

}
