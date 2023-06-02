package com.ict.edu2;

public class Test04 {

	public static void main(String[] args) {
		// 카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마 인가? (단, 부가세 10% 포함)
		String coff = "카페모카";
		
		int a = 15000;
		int b = 2;
		int c = 6500;
		
		int sum = c*b;
		int total = (int)(a - sum - (sum * 0.1));
		
		System.out.println(total);
		
		
	}

}
