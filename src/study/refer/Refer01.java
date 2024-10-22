//2024-10-22 refer 수업 null 에 대해서
package study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int num = 0;
	
		String s1;
		String s2 = null;
		
		//System.out.println(n); << 얘네는 안됨
		System.out.println(num);
		//System.out.println(s1); < 얘네는 안됨
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력:");
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		String str4 = new String("아침");
		
		System.out.println(str1 == str2);		//true
		System.out.println(str1.equals(str2));		//true
		
		System.out.println(str3 == str2);		//false
		System.out.println(str3.equals(str2));		//true
		
		System.out.println(str1 == str4);		//false
		System.out.println(str1.equals(str4)); 	//true
		
		String test = null;
		System.out.println(test.equals("널이냐"));
		// "널이냐" 이 부분을 실행시 NullPointerException 이 발생한다. 
		
		//이렇게 하면 값이 어떻게 나올까 
		
		int n1 = 10;
		int n2 = n1;
		
		String ss1 = "점심";
		String ss2 = ss1;
	}

}
