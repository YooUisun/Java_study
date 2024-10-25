//2024-10-25 모닝퀴즈

package study.quiz;

public class Quiz08_2024_10_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr = new int[5][5]; 

        	//저장
        for (int i = 0; i < 5; i++) { 
        	//i: 0 ~ 4
            for (int j = 0; j < 5; j++) {
            	// j: 0 ~ 4
                if (i == j) {
                    arr[i][j] = 1; 
                } else if (i < j) {
                    arr[i][j] = 2; 
                } else {
                    arr[i][j] = 3; 
                }
            }
        }
        	//출력
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) { 
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
