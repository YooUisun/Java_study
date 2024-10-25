//2024-10-25 메뉴 선택하고 출력해보기

package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in); 

        String[] menu = {"아메리카노", "카페라떼", "바닐라라떼"};
        int[] prices = {3500, 4100, 4300};
        int[] num = new int[3];
        
       while (true) {
        	System.out.println("========메뉴========");
       	for (int i = 0; i < menu.length; i++) {
   			System.out.printf("%d. %s %d원\n", i + 1, menu[i], prices[i]);


            }
       			System.out.println("=====================");
       
            System.out.print("메뉴선택:");
            int choice = scanner.nextInt(); 
            if (choice <1 || choice > menu.length) {
            	System.out.println("잘못된 선택입니다. 다시 선택하세요");
            	continue;
            }
            
            
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            if (quantity <=0) {
            	System.out.println("수량은 1 이상이어야 합니다.");
            	continue;
            }
            num[choice -1] += quantity;
            
            System.out.print("추가 주문하시겠습니까? (Y/N): ");
            char add = scanner.next().charAt(0);
            if(add != 'y' && add !='Y') {
            	break;
            }
         }
       
       System.out.println("\n 주문 내역:");
       int total =0;
       for (int i= 0; i < menu.length; i++) {
    	   if (num [i] > 0) {
    		   int price = prices [i] * num[i];
    		   System.out.printf("%s %d개: %d원\n" , menu[i], num[i], price);
    		   total += price;
    	   }
       }
       System.out.printf("총: %d원\n", total);
       
       
	}

}
