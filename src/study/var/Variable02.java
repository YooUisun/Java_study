//2024-10-16 Variable02

package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수타입 
		int num2 = 0b10; // 실제 가치는 2       2진수에서 0b10을 변환하면 2임
		int num8 = 012;	 // 실제 가치는 10      8진수에서 012을 변환하면 10임
		int num10 = 10;  // 실제 가치는 10      10진수에서 10을 변환하면 10임
		int num16 = 0x30; //실제 가치는 48      16진수에서 30을 변환하면 48임
		
		char var1 = 'A';
		char var2 =  86;
		char var3 = 0x0123;
		
		char var4 = 'D';   // 'AD' "Q"; 둘 다 안됨. 
//						  // 이유 1. 문자는 한 개만 넣어야함
//					      // 이유 2. 큰 따옴표가 들어가면 안됨.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴";
		String subMenu = "12313";
	    // 숫자로 쓰고 싶다면 큰 따옴표로 감싸야한다.
		
		System.out.println(menu);
		System.out.println(subMenu);
		
		System.out.println(var2 + 10);
		// 					86  + 10 
		System.out.println(menu + subMenu);
		//					점심메뉴 + 12313
		System.out.println(menu + var2);
		
		System.out.println(subMenu + 500); 
		// 이런 경우는 더하기가 안되고 subMenu 에 있는 숫자 + 500 이 되어버림
		// 12313 500 이렇게 되어버림
		
		// String 타입도 정수 타입임
		String msg = " \"안녕\" 하세요"; 
		//백슬러시 하면 큰 따옴표 안에 있는 얘가 강조됨
		System.out.println(msg);
		
		
		// 실수 타입 
		double d1 = 12.12;
		double d2 = 0.1212e2;
		float f1 = 12.12f; 
		// float 에 들어가는 값 이다 라고 해서 마지막에 f; 을 해줘야함
		
		boolean stop = false; //멈추는게 거짓이다 = 안 멈췄다
		boolean open = true; //오픈 트루다 = 열었다
		boolean close = false; // 닫는게 거짓이다 = 열었다.
	}
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub

	}	
	
	public static void main3(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void main4(String[] args) {
		// TODO Auto-generated method stub

	}
}
