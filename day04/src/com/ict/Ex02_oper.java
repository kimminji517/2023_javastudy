package com.ict;

public class Ex02_oper {

	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자가 중첩되는 것
		// int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		
		int k1 = 79;
		String str = (k1 >= 80) ? (k1 >= 90) ? "A학점" : "B학점" : "F학점";
		System.out.println(str);

		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k2 = '2';
		str = (k2 >= 'A' && k2 <= 'Z') ? "대문자" : (k2 >= 'a' && k2 <= 'z') ? "소문자" : "기타문자";
		System.out.println(str);
		
		// int k3이 1또는 3이면 남자, 2또는 4이면 여자
		// 1또는 2이면 1900년대 태어남, 3또는 4이면 2000년대 태어남, 나머지는 외국인
		
		int k3 = 1;
		str = (k3 == 1 || k3 == 3) ? (k3 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자" : 
			(k3 == 2 || k3 == 4) ? (k3 == 2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자" : "외국인";
		System.out.println(str);
		
		
		
		
		

	}

}
