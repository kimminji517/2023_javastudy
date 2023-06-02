package com.ict.edu2;

public class Test03 {

	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초 인가?
		int a = 3989;
		int b = a / 3600;
		int c = (a % 3600) / 60;
		int d = (a % 3600) % 60;
		
		System.out.println(b + "시간 " + c + "분 " + d + "초");
		

	}

}
