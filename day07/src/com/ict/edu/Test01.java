package com.ict.edu;

public class Test01 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 
		// FOR문을 이용한 누적합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				sum = sum + (i*-1);
			}else {
				sum = sum + i;
			}
		}
		System.out.println("결과 : " + sum);
		System.out.println("================");
		
		//농구공 5개씩 한 박스에 들어간다. 
		// 40개면 8상자,  26개면 6개이다. 127개면 몇상자가 필요한가요
		int k1 = 127;
		int res = 0;
		if(k1 % 5 != 0) {
			res = res + 1;
		}
		System.out.println("결과 : " + res);
		System.out.println("================");
		
		//for 문으로 플기 
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		// 0 0 0 0 를 하나로 보는 경우
		for(int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		System.out.println("================");	
		
		// 0 을 하나로 보는 경우 (0이 16개)
		for (i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("================");	
		
		//이중 for문으로 풀기
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		for(i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					System.out.print("1 ");
				}else {
				System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("================");	
		
		//for문으로 풀기 / 
		// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때, 
		// 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum2 = 0;
		int cnt = 0;
		for(i = 1; i < 1000; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + (i * -1);
			}else {
				sum2 = sum2 + (i);
			}
			cnt = i;
			if(sum2 >= 100) {
				break;
			}
		}
		System.out.println(cnt);
		
		//while문으로 풀때
		int sum3 = 0;
		int cnt1 = 0;
		i = 1;
		while(true) {
			if(i % 2 == 0) {
				sum3 = sum3 + (i * -1);
			}else {
				sum3 = sum3 + (i);
			}
			cnt1 = i;
			if(sum3 >= 100) {
				break;
			}
			i++;
		}
		System.out.println(cnt1);
		}
		
		
	}
}
