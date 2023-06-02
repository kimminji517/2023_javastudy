package com.ict.edu2;

import java.util.Scanner;

public class Study2 {
	public static void main(String[] args) {
		/*원하는 회수를 입력 받고 
		숫자를 입력 받아서 
		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 횟수 : ");
		
		int su = scan.nextInt();
		String str = "";
		
		for(int i = 0; i < su; i++) {
			System.out.print("숫자 입력 : ");
			int su2 = scan.nextInt();
		
			if(su2 % 2 == 0) {
				str = "짝수입니다";
			}else {
				str = "홀수입니다";
			}System.out.println(str);
		}
		
		/*이름, 국어, 영어, 수학를 입력 받아서 
		총점, 평균, 학점을 구하고 
		이름, 총점, 평균, 학점을 출력하는 코딩 
		(평균은 소숫점 첫째자리까지 구하자)
		*/
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어 점수 : ");
		double kor = scan.nextDouble();
		
		System.out.print("영어 점수 : ");
		double eng = scan.nextDouble();
		
		System.out.print("수학 점수 : ");
		double math = scan.nextDouble();
		
		double total = kor + eng + math;
		double avg = (int)((total*10 / 3)/10);
		str = "";
		if(avg >= 90) {
			str = "A학점";
		}else if(avg >= 80) {
			str = "B학점";
		}else if(avg >= 70) {
			str = "C학점";
		}else {
			str = "F학점";
		}
		System.out.println("이름 : "+name+", 총점 : "+total+", 평균 : "+avg+", 학점 : "+str);

		
		/*첫번째 숫자 받기
		두번째 숫자 받기
		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		*/
		System.out.print("첫번째 숫자 : ");
		int first = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int sec = scan.nextInt();
		System.out.print("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
		int opp = scan.nextInt();
		int sum = 0;
		
		switch (opp) {
		case 1: sum = first + sec; break;
		case 2: sum = first - sec; break;
		case 3: sum = first * sec; break;
		case 4: sum = first / sec; break;
		}
		System.out.println(sum);
	}
}
