//2024-10-16 Variable04


package study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1231";
		
		int n1 = 50;
		int n2 = Integer.parseInt(s1);  
	
		// 위에 Integer.parseInt 해주고 변환을 하면 
		//"1231" -> 1231 로 큰 따옴표를 없애주고 변환해줌
		
		System.out.println( s1 + n1 );
		
		System.out.println(n1 + n2);
		
		System.out.println(n1 + Integer.parseInt(s1));
		//위에 방식처럼 바로 사용할 수 있음 어쩌면 이게 더 편하고 깔끔 한 듯 
		
		String s2 ="13.13";
//		int n3 = Integer.parseInt(s2);
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);

		boolean b1 = true;
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3);
				System.out.println(b2);
				
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(123);
		String s6 = String.valueOf(88.9901);

		String s7 = 123 + "";
		// 			int + String = String 123 이라는 말임 
	}

}
