package study.refer;

public class Arr04 {

    public static void main(String[] args) {
        // 배열 참조타입 vs int 기본타입
        
        int a = 10;
        int b = a;
        System.out.println(a + " " + b);
        
        b = 20;
        System.out.println(a + " " + b);
        
        //복사가 안 된 케이스
        /* 
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; // arr2는 arr1을 참조합니다.
        
        // 루프 조건 수정
        for(int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        System.out.println();
        
        arr2[0] = 999; // arr1과 arr2는 같은 배열을 참조
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr2[i] + " ");
        }
        */
        //for 문으로 복사한 케이스

        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[3]; 
        
        //			   복사대상 위치 저장할대상 위치 개수 를 의미한다.
        System.arraycopy(arr1, 0, arr2, 0, 3);
        for(int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        for(int i=0; i<3; i++) {
        	arr2[i] =arr1[i];
        	  //0    	  0
        	  //1         1
        	  // int  =  int 값
        }
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        System.out.println();
        
        arr2[0] = 999; // arr1과 arr2는 같은 배열을 참조
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < 3; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}