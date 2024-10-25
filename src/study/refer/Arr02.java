//2024-10-22 배열에 대해서 part.02

package study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//int[] << 1차원 배열
			//int[][][] 3차원 배열
			//int[][][][] 4차원 배열
			int[][] nArr1 = new int[3][5]; //2차원 배열
			
			
		/*   0 1  2 3 4     
		0	 ㅁ ㅁ ㅁ ㅁ ㅁ
		1	 ㅁ ㅁ ㅁ ㅁ ㅁ
		2	 ㅁ ㅁ ㅁ ㅁ ㅁ
		new int[3][5]; 하면 3행의 5열 아래처럼 생기는 것임
			 */
			int[][] nArr2 = new int [2][3];
			/* 이런식으로 배열이 들어감
			 	0	1	2
			 0  ㅁ  ㅁ   ㅁ
			 1  ㅁ  ㅁ   ㅁ
			 */
			//1개 짜리 (1차원)
			int[] nA = {1,2,3,4,5,6};
			// 2개 로 나눠서 할 때 (2차원)
			int[][] nArr3 = { {1,2,3}, {4,5,6} };
			System.out.println(nArr3[0][0]);
			/*
			 0  1  2
		0	 1  2  3
		1    4  5  6
			 */
			for(int i=0; i<nArr3.length; i++) {
				// i: 0 1
				for(int j=0; j<nArr3[i].length; j++) {
					System.out.print(nArr3[i][j] + " ");
					// i : 0 0 0 1 1 1 
					// j : 0 1 2 0 1 2 
					//nArr3[0][0] nArr3[0][1] nArr3[0][2]
					//nArr3[1][0] nArr3[1][1] nArr3[1][2]
				}
				System.out.println();
			}
			
			//Ex) 처음 배열 만들때 2차원으로 이런식으로 시작하면 된다.
			int [][] nArr4 = new int[5][3];
	}

}
