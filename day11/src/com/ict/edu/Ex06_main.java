package com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06_method p1 = new Ex06_method();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		double[][] a = new double[su][3];
		
		String[] name = {};
		int[] kor = {};
		int[] eng = {};
		int[] math = {};
		int[] sum = {};
		double[] avg = {};
		String[] hak = {};
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력하자
				
		// 입력받기
		for(int i = 0; i < su; i++) {
			
//			System.out.print("이름 : ");
//			name = scan.next();
//			System.out.print("국어 점수 : ");
//			kor = scan.nextInt();
//			System.out.print("영어 점수 : ");
//			eng = scan.nextInt();
//			System.out.print("수학 점수 : ");
//			math = scan.nextInt();
//			
//			// 총점 구하기
//			sum = kor + eng + math;
//			p1.getSum();
//			// 평균 구하기
//			avg = (int)(sum / 3.0 * 10 / 10.0);
//			p1.getAvg();
//			// 학점 구하기
//			if(avg >= 90) hak = "A학점";
//			else if(avg >= 80) hak = "B학점";
//			else if(avg >= 70) hak = "C학점";
//			else hak = "F학점";
//			p1.getHak();
//		}
		
		// 순위 구하기
		
		// 순위 기준으로 오름차순 정렬
		
		// 출력하기
//		for(int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
//		System.out.println("학점 : " + hak);
		
	}
	}
}