
// 2024-10-17 모닝퀴즈

package study.quiz;

public class Quiz01_2024_10_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 문제 스타트 
		String brandName = "로지텍";
		System.out.println("브랜드명 : " + brandName);

		String name = "mx kyes";
		System.out.println("상품명 : " + name);
		
		int price = 135000;
		System.out.println("상품가격 : " + price);
	
		String keyNumber = "332L1545K";
		System.out.println("시리얼번호 : " + keyNumber);

		 // 2번 문제 스타트 
//		2. 가지고 있는 모니터 정보를 저장할 필요가 생겼습니다.
//		관련 정보 저장을 위해 아래 데이터 저장을 위한 변수를 선언하고 값을 저장해보세요!
		String companyName = "SAMSUNG";
		System.out.println("회사명 : " + companyName);
		
		int monitor = 24;
		System.out.println("모니터인치 :" + monitor);
		
		String monitorColor = "black";
		System.out.println("모니터색상 :" + monitorColor);
		
		boolean hdmi = true;
		System.out.println("HDMI포트여부 :" + hdmi);

		boolean sound = false;
		System.out.println("소리출력가능여부 :" + sound);

		/*
		   open 	isOpened
		   close	isClosed
		   hdmiport hasHdmiPort
		   playSound canPlaySound
		   
		   Ex) boolean canPlaySound = false;
		   이런식으로 사용하는게 나중에 편함
		*/
		   
		//3번문제 스타트 
		//3. 3.14 값을 가지고 있는 pi 라는 실수형 변수를 만들고 화면에 출력하세요.
		
        double pi = 3.14;
        System.out.println("원주율 : " + pi);
        
//          4번 문제 스타트
//          두 개의 문자열 변수가 우리에게 주어졌습니다. 그런데 해당 문자열 변수는 
//          어떤 학생의 점수를 가지고 있습니다.
//         주어진 점수들의 전체 합을 계산하고 싶습니다. 모든 점수를 더해서 
//          총점이 얼마인지 출력하세요.
//        (*힌트 : 숫자처럼 덧셈을 하기위해서는 숫자형태로의 변환이 필요합니다.)
        String mathScore = "85";
        String englishScore = "90";
        String artScore = "70";

//        int math = Integer.parseInt(mathScore);
//        int english = Integer.parseInt(englishScore);
//        int art = Integer.parseInt(artScore);
//
//        int totalScore = math + english + art;
//
//        System.out.println("총점: " + totalScore);
        
        //아래 방식으로 해도 되지만 위에 방식으로도 해도 된다.
        
       System.out.println( "총점 : " +
    	+ (Integer.parseInt(mathScore)
    	+  Integer.parseInt(englishScore)
    	+  Integer.parseInt(artScore))	   
    	);
       
//        //5번 문제 스타트 
//       
//       4 / 10 을 실행시켜서 결과가 0.4 가 나오는 것을 보여주려고 하는데 아래 계산 결과가 맞지 않습니다.
//       정상적으로 0.4 가 계산되서 출력되도록 만들어주세요.
        int num1 = 4;
        int num2 = 10;
        double num3 = (double) num1 / num2;
        System.out.println( num3 );
        
        
	}

}
