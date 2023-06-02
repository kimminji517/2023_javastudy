package com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		System.out.print("근무시간 : ");
		int time = scan.nextInt();
		int dan = 9620;
		int pay = 0;
		
		if(time > 8) {
			pay = (8 * dan) + (int)((time-8)*dan*1.5);
		}else {
			pay = time * dan;
		}
		System.out.println("근무시간은 "+time+"시간이고, 급여는 "+pay+"원 입니다.");

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.)
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" 
		+ "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		int menu = scan.nextInt();
		int unit = 2;
		int in = 10000;
		String drink = "";
		dan = 0;
			
		if(menu == 1) {
			dan = 3500;
			drink = "카페모카";
		}else if(menu == 2){
			dan = 4000;
			drink = "카페라떼";
		}else if(menu == 3){
			dan = 3000;
			drink = "아메리카노";
		}else if(menu == 4){
			dan = 3500;
			drink = "과일 쥬스";
		}else {
			System.out.println("1~4중에서 선택하세요");
		}
		
		int total = dan * unit;
		int vat = (int)(total * 0.1);
		int don = in - (total+vat);
		System.out.println("잔돈은 " + don + "원 입니다.");
		
		// 나라를 입력하면 수도가 출력되게 하자
		// 한국->서울, 중국->베이징, 일본->도쿄, 미국->워싱턴, 이외에는 데이터 없음
		// (switch~case)
		System.out.print("나라 : ");
		String country = scan.next();
		String str = "";
		
		switch (country) {
		case "한국": str = "서울"; break;
		case "중국": str = "베이징"; break;
		case "일본": str = "도쿄";	break;
		case "미국": str = "워싱턴"; break;
		default : str = "데이터 없음"; ;
		}
		
		System.out.println(country+"의 수도는 "+str+"입니다.");
			
	}
}
