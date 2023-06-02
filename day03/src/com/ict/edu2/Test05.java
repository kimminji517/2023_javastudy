package com.ict.edu2;

public class Test05 {

	public static void main(String[] args) {
		int su = 7368;
		
		//결과
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		int a = su / 1000;
		int b = su % 1000;
		int c = b % 100;
		int d = c % 10;

		System.out.println("천의 자리 :" + a);
		System.out.println("백의 자리 :" + (b/100));
		System.out.println("십의 자리 :" + (c/10));
		System.out.println("일의 자리 :" + (d));
		
		
		
		
		

	}

}
