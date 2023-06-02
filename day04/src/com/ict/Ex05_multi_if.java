package com.ict;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// int k1 점수가 90이상이면 A학점, 80이상이면 B학점,
		// 70이상이면 C학점, 나머지 F학점
		int k1 = 71;
		String str = "";
		
		if(k1 >= 90) {
			str = "A학점";
		}else if(k1 >= 80) {
			str = "B학점";
		}else if(k1 >= 70) {
			str = "C학점";
		}else {
			str = "F학점";
		}
		System.out.println(str);
		
		//char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = 'T';
		
		if(k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		}else if(k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		}else if(k2 >= '0' && k2 <= '9') {
			str = "숫자";
		}else {
			str = "기타문자";
		}
		System.out.println(str);
		
		// char k3이 A,a 이면 아프리카, B,b 이면 브라질,
		// C, c 이면 캐나다, 나머지는 한국
		char k3 = 'c';
		str = "";
		
		if(k3 == 'a' || k3 == 'A') {
			str = "아프리카";
		}else if(k3 == 'b' || k3 == 'B') {
			str = "브라질";
		}else if(k3 == 'c' || k3 == 'C') {
			str = "캐나다";
		}else {
			str = "한국";
		}
		System.out.println(str);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		//int menu = 1;   //내가푼것
		//int mo = 3500;
		//int ra = 4000;
		//int aa = 3000;
		//int juice = 3500;
		//int input = 10000;
		//int unit = 2; // money -= a  
		                 
	    //int money = 0;
	    
		//if(menu == 1) {
		//	money = input - (int)(mo * 1.1)*unit;
		//}else if(menu == 2) {
		//	money = input - (int)(ra * 1.1)*unit;
		//}else if(menu == 3) {
		//	money = input - (int)(aa * 1.1)*unit;
		//}else {
		//	money = input - (int)(juice * 1.1)*unit;
		//}
		//System.out.println(money);
	
		
		int menu = 1;
		int in = 10000;
		int su = 2;
		int dan = 0;
		String drink = "";
	
		
		if(menu == 1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int out = in - (total + vat);
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : " + out);
	}
}
