package com.ict.edu;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		// 5/1(월) 과제 
		// 0. 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 
		// FOR문을 이용한 누적합
		int even = 0;
		int a = -1;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				even = even + (i*a);
			}else {
				even = even + i;
			}
		}
		System.out.println("누적합 : " + even);
		
		System.out.println("===================");
		
		// 1. if~ else문
        // 농구공 5개씩 한 박스에 들어간다. 
		// 40개면 8상자,  26개면 6개이다.
		int i = 127;
		int b = i/5;
		if (i % 5 == 0) {
			System.out.println(b+"상자");
		} else {
			System.out.println(b+1+"상자");
		}
		System.out.println("===================");
		
		// 2. for 문으로 플기 
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (i = 1; i < 5; i++) {
			System.out.print("0 ");
			
			for (int j = 1; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		// 3. 이중 for문으로 풀기
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (i = 1; i < 5; i++) {
				for (int j = 1; j < 5; j++) {
					if(i == j) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}	
			}
			System.out.println();
		}
			
		System.out.println("===================");
		// 4. for문으로 풀기 / 
		// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때, 
		// 몇까지 더해야 총합이 100이상이 되는지 구하시오
		even = 0;
		for(i = 1; i>0; i++) {
			if(i % 2 == 0) {
				even = even + (-i);
			}else {
				even = even + i;
			}

			if(even == 100) break;
		}
		System.out.println("누적합 : " + i);	
		System.out.println("===================");
		
		// 5. for문으로 별찍기 
		// *
		// * *
		// * * *
		// * * * *
		for(i = 1; i < 5; i++){
			   for(int j = 0; j < i; j++){
			     System.out.print("*");
			  }
			  System.out.println(" ");
			}
		System.out.println("===================");
		
		// 6. 
		//       *
		//     * *
		//   * * *
		// * * * *  
		for(i = 1; i < 5; i++){
			for(int j = 4; j > 0; j--){
				if(i < j){
		            System.out.print(" ");
		       }else{
		            System.out.print("*");
		       }
		
			}System.out.println();
		}
		
	}
}