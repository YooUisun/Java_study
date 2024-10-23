//2024-10-22 오후 마지막 퀴즈 각각의 점수를 계산하고 합계,평균을 내는 법

package study.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수: ");
        int koreanScore = scanner.nextInt();
        
        System.out.print("수학 점수: ");
        int mathScore = scanner.nextInt();
        
        System.out.print("영어 점수: ");
        int englishScore = scanner.nextInt();

        int totalScore = koreanScore + mathScore + englishScore;
        double averageScore = totalScore / 3.0;

       //아래 주석처리 한 것 처럼 할 수 있음 저건 합격 했을때의 기준임
 //       if (koreanScore >=40 && mathScore >=40 && englishScore >=40 && averageScore >=60) {
        
        
        if (koreanScore < 40 || mathScore < 40 || englishScore < 40 || averageScore < 60) {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("국어: " + koreanScore);
            System.out.println("수학: " + mathScore);
            System.out.println("영어: " + englishScore);
    		System.out.println();

            System.out.println("합계 :" + totalScore);
  
    		int sum = 0;
    		sum = koreanScore + mathScore + englishScore;
    		double avg = sum / 3.0 ; 
    		
    		System.out.printf("평균:%.1f\n",avg);
    		
    		sum = sum + koreanScore; // 
    		sum = sum + mathScore;
    		sum = sum + englishScore;
            System.out.println("축하합니다, 합격입니다!");
        }
        
    }
}