package study.quiz;

public class Quiz01 {

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
		*/
		   
		//3번문제 스타트 
        double pi = 3.14;
        System.out.println("원주율 : " + pi);
        
        //4번 문제 스타트
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
       
        //5번 문제 스타트 
        int num1 = 4;
        int num2 = 10;
        double num3 = (double) num1 / num2;
        System.out.println( num3 );
        
        
	}

}
