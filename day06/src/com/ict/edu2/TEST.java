package com.ict.edu2;

public class TEST {

	public static void main(String[] args) {
		// 1. 이름이 홍길동인 사람의 점수가 국어 95, 영어 85, 수학 85점이다.
		// 총점과 평균을 구하자, 출력은 이름, 총점, 평균만 출력하는 코딩 작성 (평균 : 소수점 첫째자리)
		int kor = 95;
		int eng = 85;
		int math = 85;
		String name = "홍길동";
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		double res1 = (int)(avg*10)/10.0;
		System.out.print("이름 : " + name + ", 총점 : " + sum + ", 평균 : " + res1);
		System.out.println();

		// 2. 3989초는 몇시간, 몇분, 몇초인지 코딩
		int a = 3989;
		int b = a / 3600;
		int c = (a % 3600) / 60;
		int d = (a % 3600) % 60;
		System.out.print(b + "시간 " + c + "분 " + d + "초");
		System.out.println();
		
		// 3. 카페모카가 8500원, 친구와 둘이 20000원을 내고 주문 잔돈 계산하는 코딩 (부가세 10%포함)
		int dan = 8500;
		int su = 2;
		int input = 20000;
		
		int total = dan*su;
		int vat = (int)(total*0.1);
		int money = input - (total + vat);
		System.out.println("잔돈은 : " + money);
		
		// 4. 삼항연산자를 이용해 int k1이 홀수인지, 짝수인지 판별하는 코딩
		int k1 = 5;
		String str = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(str);
		
		// 5. if~else문을 이용해 char k2가 대문자인지, 대문자가 아닌지 판별하는 코딩
		char k2 = 'T';
		if(k2 >= 'A' && k2 <='Z') {
			System.out.println("대문자");
		}else {
			System.out.println("대문자 아님");
		}
		
		// 6. if~else문을 이용해 근무시간이 8시간까지는 시간당 9620이고, 8시간을 초과한 시간 만큼은
		// 1.5배 지급한다. 현재 근무한시간이 10이면 급여를 출력하는 코딩
		dan = 9620;
		int h = 10;
		int pay = 0;
		
		if(h > 8) {
			pay = (dan * 8) + (int)(dan * 1.5)*(h - 8);
		}else {
			pay = dan * 8;
		}
		System.out.println("급여 : " + pay);
		
	}

}
